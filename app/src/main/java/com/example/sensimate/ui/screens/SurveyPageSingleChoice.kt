package com.example.sensimate.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black


@Composable
fun SurveyPageSingleChoice(){
frame {
    progress_indicator(0.6f, prog = "6/7")
    questionscreen("This is a question, dont question\n" +
            "it, just answer it*")
}
    Answers()
    NextandPreviousButton()

}
@Preview
@Composable
fun SurveyPageSingleChoicePreview(){
    SurveyPageSingleChoice()
}

@Composable
fun frame(content: @Composable () -> Unit){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.White),
        contentAlignment = Alignment.TopCenter
    ){
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            content()
        }
    }
}



@Composable
fun progress_indicator(text: Float, prog: String) {

//var max = 7
Row(verticalAlignment = Alignment.CenterVertically,
modifier = Modifier.width(500.dp)) {

        LinearProgressIndicator(
            progress = text,
            modifier = Modifier
                .weight(1f)
                .padding(
                    top = 30.dp,
                    start = 40.dp
                )
                .width(300.dp)
                .height(15.dp)
                .clip(RoundedCornerShape(20.dp)),
            backgroundColor = Gray,
            color = Black,
        )
       // Text(text = prog,"/",max)
        Text(text = prog)


}}


@Composable
fun questionscreen(text: String){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    )

            {
        Column(modifier = Modifier.padding(0.dp)) {
            Box(modifier = Modifier
                .size(
                    width = 400.dp,
                    height = 100.dp
                )


                .clip(RoundedCornerShape(20.dp))
                .background(MaterialTheme.colors.onPrimary)
                .border(
                    BorderStroke(2.dp, MaterialTheme.colors.onBackground),
                    RoundedCornerShape(20.dp)
                ),
                contentAlignment = Alignment.BottomCenter

                ) {

                Row(horizontalArrangement = Arrangement.spacedBy(45.dp),
                    modifier = Modifier
                        .fillMaxHeight(1F)
                        .fillMaxWidth(1F)
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
                        Text(
                            text = text,
                            modifier = Modifier.padding(
                                top = 30.dp,
                                start = 20.dp))
                    } } } } } }

/*
Text(
    text = "This is a question, dont question\nit, just answer it *",
    style = androidx.compose.ui.text.TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    )
)
}*/

@Preview
@Composable
fun Answers() {
    val radioOptions = listOf("A", "Not me", "Me neither", "Choose A")
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


//radionbutton
/*{

Row(
    modifier = Modifier.padding(24.dp))
{
    RadioButton(
        selected = true, onClick = { /*TODO*/ }, colors = RadioButtonDefaults.colors(
            selectedColor = Color.Black,
            unselectedColor = Color.Gray,
        )
    )
    Text(text = "A", modifier = Modifier.padding(start = 16.dp))

}

Row(modifier = Modifier.padding(24.dp)) {


    RadioButton(selected = false, onClick = { /*TODO*/ }, colors = RadioButtonDefaults.colors(
        selectedColor = Color.Black,
        unselectedColor = Color.Gray,
    ))}


}*/


@Composable
fun NextandPreviousButton(){
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
        verticalAlignment = Bottom

    ) {

    Button( colors = mainButtonColor,
        onClick = { },
        modifier = Modifier
            .padding(8.dp),

        shape = RoundedCornerShape(20.dp),

    ) {
        Text(text = "<- Previous")
    }
        Button(colors = mainButtonColor,
            onClick = { },
            modifier = Modifier
                .padding(8.dp),

            shape = RoundedCornerShape(20.dp),

            ) {
            Text(text = "Next ->")

        }
        
    }}}

@Composable
fun PreviousButton(){

}
