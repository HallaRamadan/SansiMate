package com.example.sensimate.ui.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sensimate.ui.theme.color1
import com.example.sensimate.ui.theme.color2


@Composable
fun RoleChoiceViewButton(
    text: String,
    textColor: Color,
    rolechoiceview:Brush,
    onClick:() -> Unit
){
    Button(
        colors = ButtonDefaults.buttonColors(
        backgroundColor = Color.Transparent
    ),
        contentPadding = PaddingValues(),

   onClick = { onClick })
    {
        Box(modifier = Modifier
            .background(rolechoiceview)
            .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ){
            Text(text = text, color = textColor)
        }
        
    }

}

@Preview
@Composable
fun RoleChoiceViewButtonPreview(){
    RoleChoiceViewButton(
        text = "Admin",
        textColor = Color.White ,
        rolechoiceview = Brush.horizontalGradient(
            colors = listOf(
                color1,
                color2
            )
        )
    )
    { }
}

