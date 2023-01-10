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

//TODO: Create Questions class

class Question (
    questionId: String?=null,
    title: String,
    type: Int,


    var Id: String,
    var Survey: String,
    var Type: Int,
    var Title: String,
    var Subtitle: String







)