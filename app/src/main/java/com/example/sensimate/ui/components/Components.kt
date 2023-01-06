package com.example.sensimate.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.sensimate.R

@Composable
fun Background(content: @Composable () -> Unit){
    Box(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .fillMaxHeight()
            .padding(15.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier.shadow(20.dp, spotColor = Color(0xFF222222)),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            content()
        }
    }
}

@Composable
fun Card (modifier: Modifier = Modifier, alignment: Alignment = Alignment.TopCenter, content: @Composable () -> Unit){
    Box(
        modifier = modifier
            .width(370.dp)
            .height(180.dp)
            .padding().border(
                brush = Brush.horizontalGradient(listOf(Color(0xFFED7069), Color(0xFF9F6CF1))),
                width = 3.dp,
                shape = RoundedCornerShape(18.dp)
            ).background(Color(0xFF222222), RoundedCornerShape(20.dp))
            .alpha(0.85f),

        contentAlignment = alignment


    ) {
        content()
    }
}

@Composable
fun SensimateLogo(){
    Box(
        modifier =
        Modifier.background(Color(0xFF323232)).fillMaxHeight(0.1f).fillMaxWidth()
            .padding(horizontal = 12.dp), contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painterResource(R.drawable.sensimate_logo_white), "ContentDescription",
            contentScale = ContentScale.Fit,
            modifier =
            Modifier.background(Color(0xFF323232)).padding(vertical = 10.dp)
        )
    }

}