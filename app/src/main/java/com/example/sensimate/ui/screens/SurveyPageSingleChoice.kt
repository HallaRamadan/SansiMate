package com.example.sensimate.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Answer {

    val text: String
}

@Composable
fun SurveyAnswer(answer: Answer) {
    Row() {
        Text(answer.text)
        RadioButton(selected =, onClick = { /*TODO*/ })
    }
}

@Composable
fun SurveyPage_SingleChoice(answers: List<Answer>){
    Column() {
        answers.forEach { answer ->
            SurveyAnswer(
                answer = answer,
                isselected = false
            )
        }

    }

}
@Preview
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