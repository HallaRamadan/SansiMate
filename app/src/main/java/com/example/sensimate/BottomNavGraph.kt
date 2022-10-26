package com.example.sensimate

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost

@Composable
fun BottomNavGraph(navController: Unit) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.MyHome.route
    ) {
        composable(route = BottomBarScreen.MyHome.route) {
            MyHome()



        }
        composable(route = BottomBarScreen.MyProfile.route) {
            MyProfile()



        }
        composable(route = BottomBarScreen.Search.route) {




        }
    }
}


