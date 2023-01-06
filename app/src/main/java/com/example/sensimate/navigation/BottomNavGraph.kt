
package com.example.sensimate

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sensimate.navigation.BottomBarScreen
import com.example.sensimate.navigation.Screen
import com.example.sensimate.ui.screens.Discover
import com.example.sensimate.ui.screens.EventDetails
import com.example.sensimate.ui.screens.MyEvent


@Composable

fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Discover.route

    ) {
        composable(route = BottomBarScreen.Home.route) {
            MyEvent()
        }

        composable(route = Screen.EventDetails.route) {
            EventDetails()
        }
        composable(route = Screen.Discover.route) {
            Discover(navController)
        }

    }
}




