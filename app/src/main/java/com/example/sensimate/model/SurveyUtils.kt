package com.example.sensimate.model

import android.util.Log
import com.google.android.gms.tasks.Tasks


suspend fun constructSurvey(SurveyId: String): Survey? {
    //TODO: Makes use of the functions above, and constructs a surveyObject.
    //      This will be the "Main" function for retrieving and creating a surveyObject
    //      That can be used for rendering the Survey in the SurveyView
    var Survey = RetrieveAndParseSurveyJson(SurveyId)
    var Questions = RetrieveAndParseQuestionsJson(SurveyId)
    var sortedQuestions : MutableList<Question> = Questions.sortedBy { it.order } as MutableList<Question>
    Survey?.questions = sortedQuestions

    return Survey
}


