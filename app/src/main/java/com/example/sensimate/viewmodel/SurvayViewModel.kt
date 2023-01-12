package com.example.sensimate.viewmodel

import androidx.lifecycle.ViewModel
import com.example.sensimate.model.Survey
import com.example.sensimate.model.constructSurvey

class SurvayViewModel : ViewModel() {
    val _SurvayID:String =TODO()

    fun getEventSurvay(survayID: String): Survey? {
        var survey = constructSurvey(survayID)
        //TODO: Call function in datalayer, that retrives a survay json from firestore
        //      Takes a String as Parameter
        //      Returns a Survay Object
        return survey
    }

}
