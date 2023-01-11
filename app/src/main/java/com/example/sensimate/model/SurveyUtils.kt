package com.example.sensimate.model


fun constructSurvey(SurveyId: String): Survey? {
    //TODO: Makes use of the functions above, and constructs a surveyObject.
    //      This will be the "Main" function for retrieving and creating a surveyObject
    //      That can be used for rendering the Survey in the SurveyView
    var Survey = RetrieveAndParseSurveyJson(SurveyId)
    var Questions = RetrieveAndParseQuestionsJson(SurveyId)
     // Survey?.Questions = Questions

    return Survey
}


