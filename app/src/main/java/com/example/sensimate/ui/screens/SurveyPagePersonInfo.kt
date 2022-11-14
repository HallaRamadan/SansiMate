package com.example.sensimate.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize

@Composable
fun Survey_PageToPersonInfo(){
    frame {


    progress_indicator(0.1f, prog = "1/7")
    question("Before we start, we would like to\n" +
            "know a little about you")}
    Info()
    NextButton()

}

@Preview
@Composable
fun Survey_PageToPersonInfoPreview(){
    Survey_PageToPersonInfo()
}

@Preview
@Composable
fun Info() {
    Column(modifier = Modifier.padding(16.dp)) {
        Box(modifier = Modifier
            .size(
                width = 400.dp,
                height = 300.dp
            )


            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFFFFFFFF))
            .border(BorderStroke(2.dp, Color(0xFF000000)), RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.BottomCenter

        ) {

            Column(modifier = Modifier
                .align((Alignment.TopCenter)),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
                AgeInfo()
                Gender()
                Postcode()
            }

           /* Row(horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F)
            ) {
            AgeInfo()}
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F)
            ){
            Gender()}
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F)
            ){
            Postcode()}*/

    }
}}

@Preview
@Composable
fun AgeInfo(){
        Row ( modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly


        ){
            Text(text = "Age",
                modifier = Modifier.padding(
                    top = 25.dp

                )

            )
            TextField()


}}
@Composable
fun TextField(visualTransformation:VisualTransformation = VisualTransformation.None,
              keyboardOptions: KeyboardOptions = KeyboardOptions.Default) {
    val (text, setText) = remember {
        mutableStateOf("")
    }
    OutlinedTextField(value = text,
        onValueChange ={setText(it)},
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions
    )

}

@Preview
@Composable
fun Gender() {
    var expanded by remember { mutableStateOf(false) }
    val suggestions = listOf("male", "female")
    var selectedText by remember { mutableStateOf("") }

    var textfieldSize by remember { mutableStateOf(Size.Zero) }

    val icon = if (expanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown




        Row ( modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly


                ){
            Text(text = "Gender",
                modifier = Modifier.padding(
                    top = 25.dp

                )

            )

            OutlinedTextField(
                value = selectedText,
                onValueChange = { selectedText = it },
                modifier = Modifier
                    .width(200.dp)
                    .onGloballyPositioned { coordinates ->
                        //This value is used to assign to the DropDown the same width
                        textfieldSize = coordinates.size.toSize()
                    },
                label = { Text("Label") },
                trailingIcon = {
                    Icon(icon, "contentDescription",
                        Modifier.clickable { expanded = !expanded })
                }
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .width(with(LocalDensity.current) { textfieldSize.width.toDp() })
            ) {
                suggestions.forEach { label ->
                    DropdownMenuItem(onClick = {
                        selectedText = label
                        expanded = false
                    }) {
                        Text(text = label)
                    }
                }
            }
        }

    }
@Preview
@Composable
fun Postcode(){

        Row ( modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly


        ){
            Text(text = "Postcode",
                modifier = Modifier.padding(
                    top = 25.dp

                )

            )
            TextField()


        }}