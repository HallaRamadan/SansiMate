package com.example.sensimate.model

/*
JSON:

{
    SurveyID: "The unique ID given to the survey, by firestore",
    Type: 2,
    Title: "some Title",
    SubTitle: "Som subtitle"
}

The ID of the question objects, is the ID that firestore gives the document. This ID should
be stored under the attribute ID in the Question Object.
 */
//answer
//TODO: Create Questions class

class Question (
    surveyId: String?=null,
    id: String?= null,
    title: String?=null,
    type: Int?=null,
    answers: MutableList<String>?=null,
    var selectedAnswer: String? = null

) {

    val order: Int = -1
    var surveyId = surveyId
    var id = id
    var title = title
    var type = type
    var answers = answers
    var subtitle = null

    constructor(nothing: Nothing?) : this()

}
