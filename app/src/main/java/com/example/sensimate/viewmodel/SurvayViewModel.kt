package com.example.sensimate.viewmodel

import androidx.lifecycle.ViewModel
import com.example.sensimate.model.Survey

// class SurvayViewModel : ViewModel() {
    // val _SurvayID:String =TODO()
   // val Survey: Survey = getEventSurvay(_SurvayID)

 //   fun getEventSurvay(survayID: String): Survey {
        //TODO: Call function in datalayer, that retrives a survay json from firestore
        //      Takes a String as Parameter
        //      Returns a Survay Object
    //    return SurvayObject
  //  }

// }











/*
package com.example.sensimate.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf

class MainViewModel {
    fun mainView(){

        //logic
        var currentUser: User
        // Perform login and determine the current user
        val isAdmin = login()
        currentUser = if (isAdmin) Admin() else GuestUser()

        //view with the help of jetpack compose
        val view = @Composable {
            when(currentUser) {
                is GuestUser() -> showGuestUserView()
                is Admin() -> showAdminView()
            }
        }

        Compose.setConent { view }


    }
}

fun login(){
    val user: Int
    val Admin: Int


    ChoiceOfLogin = when

}


fun ChoiceOfLogin(){
    var choiceOfLogin = mutableStateOf(null)
    if (choiceOfLogin == 1){



    }
}


 */