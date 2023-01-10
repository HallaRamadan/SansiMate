package com.example.sensimate.model


fun fetchSurvay(SurveyId: String):String {
    //TODO: Calls the function in FirestoreUtils, that retrives a survay from the firestore
    //      Returns a Json String
    return JsonString
}

fun fetchQuestions(SurveyId: String):String {
    //TODO: Calls the function in FirestoreUtils, That retrives a survay from the firestore
    //      Returns an Array of JSON Strings
    return JsonString
}

fun constructSurvay(SurveyId: String): Survey {
    //TODO: Makes use of the functions above, and constructs a survayObject.
    //      This will be the "Main" function for retriving and creating a survayObject
    //      That can be used for rendering the Survay in the SurvayView
    return SurvayObject
}