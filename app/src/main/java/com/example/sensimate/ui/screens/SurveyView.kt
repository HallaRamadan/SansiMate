package com.example.sensimate.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sensimate.model.Question
import com.example.sensimate.model.Survey
import com.example.sensimate.viewmodel.MainViewModel

//TODO: This function Should take in a Survay Object, and render the question based on the question Type
//      Use forEach on Survay Objects question array, and then use a switch cases that uses the question
//      type to render the appropriat composable

//totalquestion skal defineres i Survey.kt
var currentQuestion = 1




@Composable
fun RenderSurvey(viewModel: MainViewModel) {
  //  SurveyTopBar(survey, currentQuestion.toFloat() / totalQuestions.toFloat(), currentQuestion, totalQuestions)

}



@Composable
fun Questiontype(question: Question){
    when (question.type) {
        1 -> RenderMultipleChoiceQuestion(question)
        2 -> RenderBulletPointQuestion(question)
        3 -> RenderTextInputQuestion(question)
        else -> {
            InvalidQuestionType()
        }
    }
    currentQuestion++
}

@Preview
@Composable
fun InvalidQuestionType() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
    Box(modifier = Modifier .background(color = Red), (Alignment.Center)) {
        Text("Invalid Question Type", style = TextStyle(color = Color.White), fontSize = 30.sp)
    }
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
    val radioOptions = Question.answers
    val (selectedOption, onOptionSelected) = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        radioOptions.forEach { text ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = (text == selectedOption),
                        onClick = {
                            onOptionSelected(text)
                        }
                    )
                    .padding(horizontal = 16.dp)
            ) {
                RadioButton(
                    selected = (text == selectedOption),
                    onClick = { onOptionSelected(text) }
                )
                Text(
                    text = text,
                    style = MaterialTheme.typography.body1.merge(),
                    modifier = Modifier.padding(start = 20.dp)
                )
            }
        }
    }
}

@Composable
fun RenderTextInputQuestion(Question: Question) { /*
    //TODO: Create composable that can render a Text Input question
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        TextField().forEach { text ->
*/
}



