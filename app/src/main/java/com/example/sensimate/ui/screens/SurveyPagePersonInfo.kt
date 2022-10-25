package com.example.sensimate.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Survey_PageToPersonInfo(){
    NextButton()
    PreviousButton()
    AgeInfo()
    Gender()
    Postcode()
}
@Preview
@Composable
fun Survey_PageToPersonInfoPreview(){
    Survey_PageToPersonInfo()
}


@Composable
fun AgeInfo(){

}

@Composable
fun Gender(){

}

@Composable
fun Postcode(){

}