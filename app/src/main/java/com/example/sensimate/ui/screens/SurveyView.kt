package com.example.sensimate.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.unit.dp
import com.example.sensimate.model.Question
import com.example.sensimate.model.Survey

//TODO: This function Should take in a Survay Object, and render the question based on the question Type
//      Use forEach on Survay Objects question array, and then use a switch cases that uses the question
//      type to render the appropriat composable

//totalquestion skal defineres i Survey.kt
var currentQuestion = 1
@Composable
fun RenderSurvey(survey: Survey, totalQuestions: Int) {
    SurveyTopBar(survey, currentQuestion.toFloat() / totalQuestions.toFloat(), currentQuestion, totalQuestions)
    survey.question?.forEach { question ->
        when (question.type) {
            1 -> RenderMultipleChoiceQuestion(question)
            2 -> RenderBulletPointQuestion(question)
            3 -> RenderTextInputQuestion(question)
            else -> {
                // ...andre typer spørgsmål
            }
        }
        currentQuestion++
    }
}

//TODO: Create composable that can render a multiple choice question
@Composable
fun SurveyTopBar(survey: Survey, progress: Float, currentQuestion: Int, totalQuestions: Int)
{
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            LinearProgressIndicator(
                progress = progress,
                modifier = Modifier
                    .width(500.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(color = Black)
            )
            Text("$currentQuestion/$totalQuestions")
        }

        //følgende skal der laves box with questions?? ved ikke hvad title og subtitle præcis er
      //  Text(text = survey.title, style = TextStyle(fontSize = 24.sp))
       // Text(text = survey.subtitle, style = TextStyle(fontSize = 16.sp))
    }
}

@Composable
fun SurveyBottomBar(survey: Survey) {
    //TODO: Create composable that can render a multiple choice question
}

@Composable
fun RenderMultipleChoiceQuestion(Question: Question) {
    //TODO: Create composable that can render a multiple choice question
}

@Composable
fun RenderBulletPointQuestion(Question: Question) {
    //TODO: Create composable that can render a BulletPoints choice question
}

@Composable
fun RenderTextInputQuestion(Question: Question) {
    //TODO: Create composable that can render a Text Input question
}