package com.example.sensimate.ui.screens

import android.annotation.SuppressLint
import android.util.Log
import android.view.WindowManager
import androidx.compose.foundation.background

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.FilterQuality.Companion.Low
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sensimate.model.Answer
import com.example.sensimate.R
import com.example.sensimate.model.Question
import com.example.sensimate.viewmodel.MainViewModel

//TODO: This function Should take in a Survay Object, and render the question based on the question Type
//      Use forEach on Survay Objects question array, and then use a switch cases that uses the question
//      type to render the appropriat composable

//totalquestion skal defineres i Survey.kt




@SuppressLint("UnrememberedMutableState")
@Composable
fun RenderSurvey(viewModel: MainViewModel) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp
    Box(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .height(screenHeight)
            .width(screenWidth)
            .background(color = White),
        contentAlignment = Alignment.TopCenter
    ) {
        if (!viewModel.loading.value) {
            var survey = viewModel.currentSurvey
            var question = survey?.questions!![viewModel.surveyPageCounter.value]
            var answer = viewModel.answersList.find {it.value.questionId == question.id}
            if(question.type != 1) {
                if (answer == null) {
                    answer = viewModel.newCurrentAnswer(question.id)

                }
            }else{
                answer = mutableStateOf(Answer())
            }

            val callBack: ()->Boolean = { viewModel.saveAnswers()}
            Log.w("LOOK HERE", answer?.value!!.questionId)
            Column() {
                Row(modifier = Modifier.fillMaxHeight(0.07F)) {
                        SurveyTopBar((viewModel.surveyPageCounter.value+1).toFloat().div(survey!!.questions!!.size), navigationCallback = viewModel::navigateToEventDetails)
                }
                Row(modifier = Modifier.fillMaxHeight(0.8f)) {
                    Column() {
                        Questiontype(question = question, answer=answer.value)
                    }
                }
                Row(modifier = Modifier.fillMaxHeight(1F)) {
                    SurveyBottomBar(pageCount = viewModel.surveyPageCounter, maxPageCount = survey?.questions!!.size, saveAnswerCallback = callBack )
                }
            }

        } else {
            CircularProgressIndicator(modifier = Modifier
                .align(Alignment.Center)
                    .size(80.dp)



            )
        }

    }

}

@Composable
fun Questiontype(question: Question, answer: Answer){
    Row(modifier = Modifier.fillMaxHeight(0.3f)) {
        Questionbox(Question = question)
    }
    Row(modifier = Modifier.fillMaxHeight(1f)) {
        when (question.type) {
            1 -> RenderInfo(question)
            2 -> RenderBulletPointQuestion(question, answer)
            3 -> RenderBulletPointQuestion(question,answer)
            else -> {
                InvalidQuestionType()
            }
        }
    }
}

@Composable
fun Questionbox(Question: Question){
    Question.title?.let { questionscreen(text = it) }
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

/*@Preview
@Composable
fun default(){
    var newquestion: Question = Question(
        surveyId=null,
        id = "null",
        title = "hej hvad hedder du",
        type =null,
        answers =null)
    SurveyTopBar(progress =0.6f)
}

 */



//TODO: Create composable that can render a multiple choice question
@Composable
fun SurveyTopBar(progress: Float, navigationCallback: () -> Unit) {
    Image(
        painter = painterResource(R.drawable.exitbutton),
        contentDescription = "Exit button",
        modifier = Modifier.clickable(onClick = { navigationCallback() })
        .size(40.dp),
    )
    frame {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
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
fun SurveyBottomBar(pageCount: MutableState<Int>, maxPageCount: Int, saveAnswerCallback: () -> Boolean){
    val mainButtonColor = ButtonDefaults.buttonColors(
        backgroundColor = MaterialTheme.colors.surface,
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
                Text(text = "<- Previous", color = White)
            }
            if(pageCount.value < maxPageCount-1){
            Button(colors = mainButtonColor,
                onClick = { pageCount.value++}, enabled = (pageCount.value < maxPageCount-1),
                modifier = Modifier
                    .padding(8.dp),

                shape = RoundedCornerShape(20.dp),

                ) {
                Text(text = "Next ->", color = White)

            }
            }else{
                Button(colors = mainButtonColor,
                    onClick = { saveAnswerCallback(); Log.w("here","HdfALLO")},
                    modifier = Modifier
                        .padding(8.dp),

                    shape = RoundedCornerShape(20.dp),

                    ) {
                    Text(text = "Finish Survey", color = White)
            }

        }}}
}


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
fun RenderBulletPointQuestion(Question: Question, answer: Answer) {
    //TODO: Create composable that can render a BulletPoints choice question
    val radioOptions = Question.answers
    var selectedOption by remember { mutableStateOf("") }
    selectedOption = if(answer.answers.size > 0){
        answer.answers[0]
    }else{
        ""
    }
    Column(){
    radioOptions?.forEach { text ->
        Row(
            Modifier
                .fillMaxWidth()
                .selectable(
                    selected = (text == selectedOption),
                    onClick = {
                        selectedOption = text
                        if (answer.answers.isEmpty()) {
                            answer.answers.add(text)
                        } else {
                            answer.answers[0] = text
                        }
                    }
                )
                .padding(horizontal = 16.dp), verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = (text == selectedOption),
                onClick = { selectedOption = text
                    if(answer.answers.isEmpty()){
                        answer.answers.add(text)
                    }else{
                        answer.answers[0] = text
                    }},
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color.Magenta,
                    unselectedColor = Color.DarkGray,
                    disabledColor = Color.LightGray
                ),
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
fun RenderInfo(Question: Question) {
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


