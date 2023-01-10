package com.example.sensimate.model

import android.util.Log
import java.util.Collections.list

fun RetriveAndParseSurveyJson(surveyID: String):String {
    //TODO: Connects to the firestore, and retrives a survay based on ID
    //      Returns a JSON Strings
    return JsonString
}

fun RetriveAndParseQuestionsJson(surveyID: String):Array<String> {
    //TODO: Connects to the firestore, and retrives questions based on ID
    //      Returns an Array of JSON Strings
    val questionsArray: Array<Question> = list()

    db.collection("questions")
        .whereEqualTo("surveyId", surveyID)
        .get()
        .addOnSuccessListener { documents ->
            for (document in documents) {
                Log.d(TAG, "${document.id} => ${document.data}")
            }
        }
        .addOnFailureListener { exception ->
            Log.w(TAG, "Error getting documents: ", exception)
        }
    return [JsonStrings]
}