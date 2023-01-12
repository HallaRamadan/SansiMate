package com.example.sensimate.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sensimate.ui.theme.color1
import com.example.sensimate.ui.theme.color2
import com.example.sensimate.viewmodel.MainViewModel

@Composable
fun RoleChoiceView(){
    Box(modifier = Modifier
        .fillMaxSize()
        .border(BorderStroke(1.dp, Color.Black))
        .background(MaterialTheme.colors.onBackground),
        contentAlignment = Alignment.Center)

    {
        Button(
            onClick = { "Admin" })
        { }
        Button(
            onClick = { "User" })
        { }
    }
}


// Compose for button nummber 0ne ( Admin)
@Composable
fun RoleChoiceViewButton1(
    text: String,
    textColor: Color,
    rolechoiceview1: Brush,
    role: MutableState<String>,
    onClick: () -> Unit,
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent),
        contentPadding = PaddingValues(),

        onClick = { role.value = text }
    ) {

        Box(modifier = Modifier
            .background(rolechoiceview1)
            .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Text(text = text, color = textColor)
        }
    }
}

@Composable
fun RoleChoiceViewButton2(text: String,
                    textColor: Color,
                    rolechoiceview2: Brush,
                          role: MutableState<String>,
                    onClick: () -> Unit,

) {
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent),
        contentPadding = PaddingValues(),
        onClick = { role.value = text }) {
        Box(modifier = Modifier
            .background(rolechoiceview2)
            .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.TopCenter) {
            Text(text = text , color = textColor)
        }
    }
}


@Composable
fun  RoleChoiceView (viewModel: MainViewModel) {

    // Button to Admin
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(1F),
    ) {


        RoleChoiceViewButton1(text = "Admin",
            textColor = Color.White,
            rolechoiceview1 = Brush.horizontalGradient(colors = listOf(color1, color2)),
            role = viewModel.role
        ) { }
        Spacer(modifier = Modifier.height(16.dp))

        // Button to User
        RoleChoiceViewButton2(text = "User",
            textColor = Color.White,
            rolechoiceview2 = Brush.horizontalGradient(colors = listOf(color1, color2)),
            role = viewModel.role
        ) { }
    }
}

  /*

if (Role == "Admin"){
      //  ShowthisapptoAdmin()

    }
    else if(Role == "User" ){
        ShowthisapptoUser()

    }*/

 //

@Preview
@Composable
fun RoleChoiceViewButtonPreview() {
    val role = remember{mutableStateOf("")}
    RoleChoiceView()

    // Button to Admin
    RoleChoiceViewButton1(text = "Admin",
        textColor = Color.White,
        rolechoiceview1 = Brush.horizontalGradient(colors = listOf(color1, color2)), role = role) { }
    Spacer(modifier = Modifier.height(16.dp))

    // Button to User
    RoleChoiceViewButton2(text = "User",
        textColor = Color.White,
        rolechoiceview2 =Brush.horizontalGradient(colors = listOf(color1, color2)), role = role ) {}
}






