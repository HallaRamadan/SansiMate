package com.example.sensimate.ui.screens

import android.graphics.Color.GRAY
import android.widget.GridLayout
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sensimate.R
import java.time.format.TextStyle
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
@Preview
@Composable
fun SurveyPage_SingleChoice(){
val shape = RoundedCornerShape(12.dp)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFAF0))
            .padding(16.dp)
    )

            {
        Column(modifier = Modifier.padding(0.dp)) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .heightIn(min = 120.dp)
                    .fillMaxWidth(1F)
                    .border(BorderStroke(1.dp, Gray), RoundedCornerShape(20.dp)),
                contentAlignment = Alignment.CenterStart,



                ) {

                Row(horizontalArrangement = Arrangement.spacedBy(45.dp),
                    modifier = Modifier
                        .fillMaxHeight(1F)
                        .fillMaxWidth(1F)
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
                        Text(text = "This is a question, dont question\nit, just answer it*")
                    }

                }
            }




        }
    }


/*
Text(
    text = "This is a question, dont question\nit, just answer it *",
    style = androidx.compose.ui.text.TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    )
)
}*/


@Composable
fun SurveyPage_SingleChoicePreview(){
    SurveyPage_SingleChoice()
}

@Composable
fun NextButton(){

}

@Composable
fun PreviousButton(){

}