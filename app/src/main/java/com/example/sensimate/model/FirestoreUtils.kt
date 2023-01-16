package com.example.sensimate.model

import android.util.Log
import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


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


suspend fun RetrieveAndParseSurveyJson(surveyID: String):Survey? {

    //TODO: Connects to the firestore, and retrives a survay based on ID
    //      Returns a JSON Strings
    val docRef = FirestoreDatabase.firestore.collection("surveys").document(surveyID)
    var surveyObject: Survey? = null

    val task = docRef.get()
    val document = Tasks.await(task)
    return document.toObject<Survey>()
}

suspend fun RetrieveAndParseQuestionsJson(surveyID: String):MutableList<Question> {
    //TODO: Connects to the firestore, and retrives questions based on ID
    //      Returns an Array of JSON Strings
    val docRef = FirestoreDatabase.firestore.collection("questions").whereEqualTo("surveyId", surveyID)
    val questionList: MutableList<Question> = mutableListOf()
    val task = docRef.get()
    val documents = Tasks.await(task)
    if(documents != null) {
        for (document in documents) {
            questionList.add(document.toObject())
        }
    }else{
        Log.d("FirestoreUtils", "RetrieveAndParseQuestionsJson: documents null")
    }
    return questionList
}

suspend fun ParseAnswerToJsonAndSaveInDB(answer: Answer){
    val gson = Gson()
    val json: String = gson.toJson(answer)
    val jsonMap: Map<String, Any> =
        Gson().fromJson(json, object : TypeToken<HashMap<String?, Any?>?>() {}.type)
    val docRef = FirestoreDatabase.firestore.collection("answers").add(jsonMap)
    Tasks.await(docRef)
    val dbAnswer = FirestoreDatabase.firestore.collection("answers").document(docRef.result.id)
    val done = dbAnswer.update("id",docRef.result.id)
    Tasks.await(done)

}