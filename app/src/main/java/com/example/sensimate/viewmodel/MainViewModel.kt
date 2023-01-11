package com.example.sensimate.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.sensimate.R
import com.example.sensimate.model.Event

/*
 class SurvayViewModel : ViewModel() {
     val _SurvayID:String =TODO()
    val Survey: Survey = getEventSurvay(_SurvayID)

    fun getEventSurvay(survayID: String): Survey {
        TODO: Call function in datalayer, that retrives a survay json from firestore
              Takes a String as Parameter
              Returns a Survay Object
        return SurvayObject
         }
 }
*/



class MainViewModel : ViewModel() {
    val eventList = listOf(
        Event(id = 1,
            title = "Beer from GoldStar",
            date = "12/01/2023",
            image = R.drawable.hand_beer, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 2,
            title = "Cider from Goldstar",
            date = "24/02/2023",
            image = R.drawable.coke, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            title = "Soda from Hejsommer",
            date = "29/03/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
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
            country = "Denmark"),        Event(id = 3,
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
            country = "Denmark"),        Event(id = 3,
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
            country = "Denmark"),        Event(id = 3,
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
            country = "Denmark"),        Event(id = 3,
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





        )

}





