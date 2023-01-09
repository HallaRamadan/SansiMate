package com.example.sensimate.model


fun parseSurveyJson(JsonString: String): Survey {
    //TODO: Takes in the Json string from firestore, and parses it to surveyClass
    //      This function might also call parseQuestionsJson
    //      Returns a Survey object
    return SurveyObject
}

fun parseQuestionsJson(JsonString: String): Array<Question> {
    //TODO: Takes in Json String from firestore, and parses it to QuestionClass
    //      Returns an Array of Question objects
    return [QuestionObject]
}

fun fetchSurvey(SurveyId: String):String {
    //TODO: Calls the function in FirestoreUtils, that retrives a survey from the firestore
    //      Returns a Json String
    return JsonString
}

fun fetchQuestions(SurveyId: String):String {
    //TODO: Calls the function in FirestoreUtils, That retrives a survey from the firestore
    //      Returns an Array of JSON Strings
    return JsonString
}

fun constructSurvey(SurveyId: String): Survey {
    //TODO: Makes use of the functions above, and constructs a surveyObject.
    //      This will be the "Main" function for retriving and creating a surveyObject
    //      That can be used for rendering the Survey in the SurveyView
    return SurveyObject
}