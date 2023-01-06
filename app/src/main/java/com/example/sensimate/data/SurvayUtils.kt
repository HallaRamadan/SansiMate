package com.example.sensimate.data


fun parseSurveyJson(JsonString: String):Survay {
    //TODO: Takes in the Json string from firestore, and parses it to survayClass
    //      This function might also call parseQuestiJson
    //      Returns a Survay object
    return SurvayObject
}

fun parseQuestionsJson(JsonString: String): Array<Question> {
    //TODO: Takes in Json String from firestore, and parses it to QuestionClass
    //      Returns an Array of Question objects
    return [QuestionObject]
}

fun fetchSurvay(SurvayId: String):String {
    //TODO: Calls the function in FirestoreUtils, that retrives a survay from the firestore
    //      Returns a Json String
    return JsonString
}

fun fetchQuestions(SurvayId: String):String {
    //TODO: Calls the function in FirestoreUtils, That retrives a survay from the firestore
    //      Returns an Array of JSON Strings
    return JsonString
}
