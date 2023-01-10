package com.example.sensimate.model

import android.util.Log

fun RetriveAndParseSurveyJson(surveyID: String):Survey? {
    //TODO: Connects to the firestore, and retrives a survay based on ID
    //      Returns a JSON Strings
    val docRef = db.collection("surveys").document(surveyID)
    var surveyObject: Survey? = null

    docRef.get()
        .addOnSuccessListener { document ->
            if (document != null) {
                surveyObject = document.toObject<Survey>()
            } else {
                Log.d("Firestore onSuccess", "No such document")
            }
        }
        .addOnFailureListener { exception ->
            Log.d("Firestore onFailure", "get failed with ", exception)
        }
    return surveyObject
}

fun RetriveAndParseQuestionsJson(SurveyID: String):Array<String> {
    //TODO: Connects to the firestore, and retrives questions based on ID
    //      Returns an Array of JSON Strings
    return [JsonStrings]
}