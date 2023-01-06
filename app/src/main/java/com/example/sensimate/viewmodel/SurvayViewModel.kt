package com.example.sensimate.viewmodel

import androidx.lifecycle.ViewModel
import com.example.sensimate.data.Survay

class SurvayViewModel : ViewModel() {
    val _SurvayID:String =TODO()
    val Survay:Survay = getEventSurvay(_SurvayID)

    fun getEventSurvay(survayID: String): Survay {
        //TODO: Call function in datalayer, that retrives a survay json from firestore
        //      Takes a String as Parameter
        //      Returns a Survay Object
        return SurvayObject
    }

}