package com.example.sensimate.ui.screens

import android.util.Log
import android.view.WindowManager
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sensimate.BottomBar
import com.example.sensimate.currentRoute
import com.example.sensimate.model.Question
import com.example.sensimate.model.Survey
import com.example.sensimate.ui.components.SensimateLogo
import com.example.sensimate.viewmodel.MainViewModel

//TODO: This function Should take in a Survay Object, and render the question based on the question Type
//      Use forEach on Survay Objects question array, and then use a switch cases that uses the question
//      type to render the appropriat composable

//totalquestion skal defineres i Survey.kt
var currentQuestion = 1




@Composable
fun RenderSurvey(viewModel: MainViewModel) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp
    Box(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .height(screenHeight).width(screenWidth).background(color = White),
        contentAlignment = Alignment.TopCenter
    ) {
        if (!viewModel.loading.value) {
            var survey = viewModel.currentSurvey
            Column() {
                Row(modifier = Modifier.fillMaxHeight(0.2F)) {
                        SurveyTopBar((viewModel.surveyPageCounter.value+1).toFloat().div(survey!!.questions!!.size))

                }
                Row(modifier = Modifier.fillMaxHeight(0.8f)) {
                    Column() {
                        Questiontype(question = survey?.questions!![viewModel.surveyPageCounter.value])
                    }
                }
                Row(modifier = Modifier.fillMaxHeight(1F)) {
                    SurveyBottomBar(pageCount = viewModel.surveyPageCounter, maxPageCount = survey?.questions!!.size)
                }
            }

        } else {
            Text("Loading")
        }

    }

}

@Composable
fun Questiontype(question: Question){
    when (question.type) {
        1 -> RenderBulletPointQuestion(question)
        2 -> RenderBulletPointQuestion(question)
        3 -> RenderBulletPointQuestion(question)
        else -> {
            InvalidQuestionType()
        }
    }
    currentQuestion++
}

@Composable
fun Questionbox(Question: Question){
    Question.title?.let { question(text = it) }
}

@Preview
@Composable
fun InvalidQuestionType() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically){
        Box(modifier = Modifier .background(color = Red), (Alignment.Center)) {
            Text("Invalid Question Type", style = TextStyle(color = Color.White), fontSize = 30.sp)
        }
    }
}

@Preview
@Composable
fun default(){
    var newquestion: Question = Question(    surveyId=null,
        id = null,
        title = "hej hvad hedder du",
        type =null,
        answers =null)
    SurveyTopBar(progress =0.6f)
}



//TODO: Create composable that can render a multiple choice question
@Composable
fun SurveyTopBar(progress: Float)

{
    frame {


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
                        .background(color = White),
                    color = Black

                )
            }
            //følgende skal der laves box with questions?? ved ikke hvad title og subtitle præcis er
            //  Text(text = survey.title, style = TextStyle(fontSize = 24.sp))
            // Text(text = survey.subtitle, style = TextStyle(fontSize = 16.sp))
        }
    }}




@Composable
fun SurveyBottomBar(pageCount: MutableState<Int>, maxPageCount: Int){
    val mainButtonColor = ButtonDefaults.buttonColors(
        backgroundColor = Color.Black,
        contentColor = MaterialTheme.colors.surface)
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Bottom

        ) {

            Button( colors = mainButtonColor,
                onClick = { pageCount.value-- },enabled = (pageCount.value > 0),
                modifier = Modifier
                    .padding(8.dp),

                shape = RoundedCornerShape(20.dp),

                ) {
                Text(text = "<- Previous")
            }
            Button(colors = mainButtonColor,
                onClick = { pageCount.value++}, enabled = (pageCount.value < maxPageCount-1),
                modifier = Modifier
                    .padding(8.dp),

                shape = RoundedCornerShape(20.dp),

                ) {
                Text(text = "Next ->")

            }

        }}}


/*
@Composable
fun SurveyBottomBar(pageCount: MutableState<Int>, maxPageCount: Int) {
    Box(contentAlignment = Alignment.TopCenter){
        Row(){
            Column(Modifier.fillMaxWidth(0.5F),horizontalAlignment = Alignment.CenterHorizontally) {

                Button(onClick = { pageCount.value-- },enabled = (pageCount.value > 0)) {

                }
            }
            Column(Modifier.fillMaxWidth(1F), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom) {
                Button(onClick = { pageCount.value++}, enabled = (pageCount.value < maxPageCount-1)) {

                }
            }
        }
    }
}*/

@Composable
fun RenderMultipleChoiceQuestion(Question: Question) {
    //TODO: Create composable that can render a multiple choice question
}

@Composable
fun RenderBulletPointQuestion(Question: Question) {
    //TODO: Create composable that can render a BulletPoints choice question
    val radioOptions = Question.answers
    val (selectedOption, onOptionSelected) = remember { mutableStateOf("") }

    radioOptions?.forEach { text ->
        Log.w("LOOK HERE", text)
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

@Composable
fun RenderTextInputQuestion(Question: Question) {
    //hardcoded. first Question and answer options will be the same for all surveys
    Info()

}
/*
Column(
    modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
    TextField().forEach { text ->


*/


