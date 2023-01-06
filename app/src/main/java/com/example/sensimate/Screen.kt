package com.example.sensimate

sealed class Screen(val route: String) {
    object Discover : Screen("discover")
    object EventDetails : Screen("event_details")
    object DiscoverEm : Screen("discover_em")
}

