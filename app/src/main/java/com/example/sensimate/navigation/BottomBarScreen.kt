package com.example.sensimate.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen (

    val route: String,
    val title: String,
    val icon: ImageVector


        ) {
   object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
   )

    object Profile: BottomBarScreen(
        route = "discover_em",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object Discover: BottomBarScreen(
        route = "discover",
        title = "Discover",
        icon = Icons.Default.Search
    )



}