package com.example.sensimate.model

import com.example.sensimate.navigation.Screen


//TODO: create Attribute, that contains the SurveyID
class Event(
    id: Int,
    surveyId: String? = null,
    title:String,
    date:String,
    image: Int,
    street:String,
    town:String,
    postcode: Int,
    country:String){
    var id = id
    var surveyId = surveyId
    var title = title
    var date = date
    var image = image
    var street = street
    var town = town
    var postcode = postcode
    var country = country

    @Override
    override fun toString(): String {
        return "$id, $image"
    }
}


