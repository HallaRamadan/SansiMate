package com.example.sensimate.ui.screens

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import com.example.sensimate.BottomBarScreen
import com.example.sensimate.BottomNavGraph

//class SensiMate_Screen {
// }
/* ------Composable that displays the MenuBar-----*/

@Composable
fun SensiMate_Screen(){
    val navController =remeberNavController()
    Scaffold(
        bottomBar= {BottomBar(navController = navController)}) {
        BottomNavGraph(
            navController = navController
        )

    }

}
@Composable
fun BottomBar(navController: Unit){
    val screen = listOf(
        BottomBarScreen.MyHome,
        BottomBarScreen.MyProfile,
        BottomBarScreen.Search,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    
    
    BottomNavigation {
        screen.forEach{
                screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController,
            )
        }
        
    }
}
@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController:NavHostController
){
    BottomNavigationItem(
    label = {
        Text(text=screen.title)
            },
    icon = {
        Icon(
            imagVector =screen.icon,
            contentDescription="Navigation Icon")
           },
    selected = currentDestination.hierarchy.any
    {
        it.route == screen.route
    },
    onClicke = {
        navController.navigate(screen.route)
    }
    )
}



fun remeberNavController() {

}
