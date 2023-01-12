package com.example.sensimate.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sensimate.ui.theme.color1
import com.example.sensimate.ui.theme.color2

 @Composable
fun RoleChoiceView(){
    Box(modifier = Modifier
        .fillMaxSize()
        .border(BorderStroke(1.dp, Color.Black))
        .background(Color.Black),
        contentAlignment = Alignment.Center)
    {

    }
}

// Compose for button nummber 0ne ( Admin)
@Composable
fun RoleChoiceViewButton1(
    text: String,
    textColor: Color,
    rolechoiceview1: Brush,
    onClick: () -> Unit)
{
    Column() {
        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent),
            contentPadding = PaddingValues(),

            onClick = { onClick }
        ) {

            Box(modifier = Modifier
                .background(rolechoiceview1)
                .padding(horizontal = 16.dp, vertical = 8.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Text(text = "Admin ", color = textColor)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent),
            contentPadding = PaddingValues(),
            onClick = { onClick }

        ) {
            Box(modifier = Modifier
                .background(rolechoiceview1)
                .padding(horizontal = 16.dp, vertical = 8.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Text(text = "User ", color = textColor)
            }
        }
    }
}
@Preview
@Composable
fun RoleChoiceViewButtonPreview() {
    RoleChoiceView()

    // Button nummber 1
    RoleChoiceViewButton1(
        text = "Admin",
        textColor = Color.White,
        rolechoiceview1 = Brush.horizontalGradient(
            colors = listOf(
                color1,
                color2
            )
        )
    ) { }
}






