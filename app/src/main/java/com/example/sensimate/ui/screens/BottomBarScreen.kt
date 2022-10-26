package com.example.sensimate.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(val route:String, val title:String, val icon: ImageVector){

    object MyHome: BottomBarScreen(
        route= "MyHome",
        title ="MyHome",
        icon= Icons.Default.Home
    )
    object MyProfile: BottomBarScreen(
        route = "MyProfile",
        title = "MyProfile",
        icon= Icons.Default.Person
    )
    object Search: BottomBarScreen(
        route = "Search",
        title = "Search",
        icon = Icons.Default.Search
    )
   /* object MenuBar:BottomBarScreen(
        route = "MenuBar",
        title = "MenuBar",
        icon = Icons.Default.Bottom
    ) */
}

