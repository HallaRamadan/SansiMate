package com.example.sensimate

import com.example.sensimate.model.FirestoreDatabase
import com.google.firebase.firestore.FirebaseFirestore
import org.junit.After
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    //Using this already implemented Test, to check on the logic of simple addition.
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}


class FireStoreAddDocument {

    @Test

    fun add_document() {
        val db = FirestoreDatabase
        val collection = "test-collection"
        val data = mapOf("field1" to "value1", "field2" to "value2")
        db.addDocument(collection, data)

        val firestore = FirebaseFirestore.getInstance()
        val addedDocument = firestore.collection(collection)
            .whereEqualTo("field1", "value1")
            .whereEqualTo("field2", "value2")
            .get()
            .result
            .documents
        assertTrue(addedDocument.isNotEmpty())

    }

    @Test
    fun get_document() {
        val db = FirestoreDatabase
        val collection = "test-collection"
        val document = "test-document"
        val data = mapOf("field1" to "value1", "field2" to "value2")
        val firestore = FirebaseFirestore.getInstance()
        firestore.collection(collection).document(document).set(data)
        val retrievedData = db.getDocument(collection, document)
        assertEquals(data, retrievedData)
    }

    @Test
    fun delete_Document() {
        val db = FirestoreDatabase
        val collection = "test-collection"
        val document = "test-document"
        val data = mapOf("field1" to "value1", "field2" to "value2")
        val firestore = FirebaseFirestore.getInstance()
        firestore.collection(collection).document(document).set(data)
        db.deleteDocument(collection, document)

        val deletedDocument = firestore.collection(collection).document(document).get().result
        assertFalse(deletedDocument.exists())

    }

    @After
    fun clearTestCollection() {
        val firestore = FirebaseFirestore.getInstance()
        firestore.collection("test-collection")
            .get()
            .addOnSuccessListener { snapshot ->
                for (document in snapshot.documents) {
                    document.reference.delete()
                }
            }
    }
}

