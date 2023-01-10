package com.example.sensimate.model

import android.util.Log
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


// object FirestoreSingleton {
   // val db: FirebaseFirestore by lazy { FirebaseFirestore.getInstance() }
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




// And then you can use the singleton object like this:
// FirebaseDatabase.addValue("users", mapOf("name" to "John", "age" to 30))
// val userData = FirebaseDatabase.getValue("users/John")
// FirebaseDatabase.deleteValue("users/John")


fun RetrieveAndParseSurveyJson(surveyID: String):String {
    //TODO: Connects to the firestore, and retrives a survay based on ID
    //      Returns a JSON Strings
    return JsonString
}

fun RetrieveAndParseQuestionsJson(SurveyID: String):Array<String> {
    //TODO: Connects to the firestore, and retrives questions based on ID
    //      Returns an Array of JSON Strings
    return [JsonStrings]
}