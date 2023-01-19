
package com.example.sensimate

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sensimate.navigation.BottomBarScreen
import com.example.sensimate.navigation.Screen
import com.example.sensimate.ui.screens.Discover
import com.example.sensimate.ui.screens.EventDetails
import com.example.sensimate.ui.screens.MyEvent
import com.example.sensimate.ui.screens.RenderSurvey
import com.example.sensimate.viewmodel.MainViewModel


@Composable

fun BottomNavGraph(navController: NavHostController, viewModel: MainViewModel) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Discover.route

    ) {
        composable(route = BottomBarScreen.Home.route) {
            MyEvent(viewModel)
        }

        composable(route = Screen.EventDetails.route) {
            EventDetails(viewModel)
        }
        composable(route = Screen.Discover.route) {
            Discover(viewModel)
        }
        composable(route = Screen.Survey.route){
            RenderSurvey(viewModel)
        }


    }
}




