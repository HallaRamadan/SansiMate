package com.example.sensimate.model

import com.example.sensimate.navigation.Screen


//TODO: create Attribute, that contains the SurveyID
class Event() {
    var id = ""
    var surveyId = ""
    var title = ""
    var date = ""
    var image = ""
    var street = ""
    var town = ""
    var postcode = ""
    var country = ""

    @Override
    override fun toString(): String {
        return "$id, $image"
    }
}


