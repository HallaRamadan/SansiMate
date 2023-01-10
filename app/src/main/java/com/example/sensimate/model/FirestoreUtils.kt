package com.example.sensimate.model

import android.util.Log
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


// object FirestoreSingleton {
//    val db: FirebaseFirestore by lazy { FirebaseFirestore.getInstance() }
// }

object FirestoreDatabase {
    val firestore = Firebase.firestore
    val currentUser = Firebase.auth.currentUser

    fun addDocument(collection: String, data: Map<String, Any>) {
        firestore.collection(collection)
            .add(data)
            .addOnSuccessListener { Log.d("Firestore", "Document added successfully!") }
            .addOnFailureListener { e -> Log.w("Firestore", "Error adding document", e) }
    }
    fun getDocument(collection: String, document: String) {
        firestore.collection(collection)
            .document(document)
            .get()
            .addOnSuccessListener {
                Log.d("Firestore", "Document retrieved successfully!")
                // Get the data from the snapshot here
                it.data
            }
            .addOnFailureListener { e -> Log.w("Firestore", "Error getting document", e) }
    }
    fun deleteDocument(collection: String, document: String) {
        firestore.collection(collection)
            .document(document)
            .delete()
            .addOnSuccessListener { Log.d("Firestore", "Document deleted successfully!") }
            .addOnFailureListener { e -> Log.w("Firestore", "Error deleting document", e) }
    }
}
// You can use the singleton like this:

// FirestoreDatabase.addDocument("users", mapOf("name" to "John", "age" to 30))
// val userData = FirestoreDatabase.getDocument("users", "John")
// FirestoreDatabase.deleteDocument("users", "John")




// fun RetriveSurvey(surveyID: String):String {
    //TODO: Connects to the firestore, and retrives a survay based on ID
    //      Returns a JSON Strings
    // return JsonString
// }

// fun RetriveQuestions(SurveyID: String):Array<String> {
    //TODO: Connects to the firestore, and retrives questions based on ID
    //      Returns an Array of JSON Strings
    // return [JsonStrings]
// }