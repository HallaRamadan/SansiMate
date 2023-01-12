package com.example.sensimate.viewmodel

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.example.sensimate.R
import com.example.sensimate.model.Event
import com.example.sensimate.model.Survey
import com.example.sensimate.model.constructSurvey
//import com.example.sensimate.model.constructSurvey
import com.example.sensimate.navigation.Screen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/*
 class SurvayViewModel : ViewModel() {
     val _SurvayID:String =TODO()
    val Survey: Survey = getEventSurvay(_SurvayID)


 }
*/



class MainViewModel : ViewModel() {
    var loading = mutableStateOf(false)
    var navController: NavController? = null
    var currentViewedEvent: Event? = null
    var currentSurvey: Survey? = null
    var answersList: MutableList<MutableList<String>> = mutableListOf()
    var currentQuestionIndex: Int? = null
    val eventList = listOf(
        Event(id = 1,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Beer from GoldStar",
            date = "12/01/2023",
            image = R.drawable.hand_beer, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 2,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Cider from Goldstar",
            date = "24/02/2023",
            image = R.drawable.coke, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),        Event(id = 3,
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            surveyId = "upx7JFmXZmA6Gvo6Qyyz",
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        )



    fun getEventSurvey() {
        viewModelScope.launch(Dispatchers.IO) {
            loading.value = true
            Log.w("LOOK HERE", currentViewedEvent!!.surveyId!!)
            currentSurvey = constructSurvey(currentViewedEvent!!.surveyId!!)
            loading.value = false
        }
    }
    fun navigateToSurvey(){
        if(navController != null){
            navController!!.navigate(Screen.Survey.route)
        }else{
            Log.w("viewModel", "NavController is null")
        }

    }
    fun navigateToEventDetails(){
        if(navController != null){
            navController!!.navigate(Screen.EventDetails.route)
        }else{
            Log.w("viewModel", "NavController is null")
        }
    }
}





