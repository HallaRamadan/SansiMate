package com.example.sensimate.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sensimate.R

@Preview
@Composable
fun BurgerMenuScreenPreview(){
    BurgerMenuScreen()

}



@Composable
fun BurgerMenuScreen(){
    Box(modifier = Modifier.width(350.dp).fillMaxHeight(10.4F).border(BorderStroke(1.dp,Color.White),
        RoundedCornerShape(10.dp)).background(Color.White, RoundedCornerShape(10.dp)))
    Box(modifier = Modifier
        .width(300.dp)
        .fillMaxHeight(30.6F)
        .border(BorderStroke(1.dp, Color.Black), RoundedCornerShape(30.dp))
        .background(Color.Black, RoundedCornerShape(20.dp)),
        contentAlignment = Alignment.Center)
    {

        Row(horizontalArrangement = Arrangement.spacedBy(2.dp), modifier = Modifier.padding(3.dp)) {
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    painter = painterResource(R.drawable.star),
                    contentDescription = null,
                    modifier = Modifier.width(100.dp),
                    alignment = Alignment.TopStart)
                Spacer(modifier = Modifier.height(16.dp))
               // Text(text = stringResource(R.string.SensiMate), fontStyle = MaterialTheme.colors,Color.)


        }



    }
}





















/*import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier */
//import androidx.compose.ui.tooling.preview.Preview
/*import androidx.navigation.NavHost
import androidx.navigation.NavHostController */




/*---  enum values that represent the screens in the app-----
enum class BurgerMenu(){
    MyHome,
    Discover,
    MyProfile

}
@Composable
fun BurgerMenuApp (modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Scaffold(topBar ={}){

        val innerPadding = null    // add more
        NavHost( navController = navController,
            startDestination = BurgerMenu.MyHome.name,
            modifier = modifier.padding(innerPadding)
        )
        {
            composable(route = BurgerMenu.MyHome.name) {
                MyEvent()
            }
            composable(route = BurgerMenu.Discover.name){
                Discover()
            }
            composable(route = BurgerMenu.MyProfile.name){
                My_Profile()
            }

        }
    }
}

 */






/*---------------------
@Composable
fun HomeButton(){

}
@Composable
fun DiscoverBurger(){

}
@Composable
fun ProfileBurger(){

}
--------------------------- */