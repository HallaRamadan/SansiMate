package com.example.sensimate.ui.screens

import androidx.compose.runtime.Composable
import com.example.sensimate.model.Question
import com.example.sensimate.model.Survey

@Composable
fun RenderSurvey(Survey: Survey){
    //TODO: This function Should take in a Survay Object, and render the question based on the question Type
    //      Use forEach on Survay Objects question array, and then use a switch cases that uses the question
    //      type to render the appropriat composable
}

@Composable
fun SurveyTopBar(survey: Survey) {
    //TODO: Create composable that can render a multiple choice question
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