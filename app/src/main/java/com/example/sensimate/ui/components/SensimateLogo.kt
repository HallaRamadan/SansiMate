package com.example.sensimate.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.sensimate.R

@Composable
fun SensimateLogo(){
    Box(modifier =
    Modifier.background(Color(0xFF323232)).fillMaxHeight(0.1f).fillMaxWidth().padding(horizontal = 12.dp),contentAlignment = Alignment.TopCenter){
        Image(
            painterResource(R.drawable.sensimate_logo_white), "ContentDescription",
            contentScale = ContentScale.Fit,
            modifier =
            Modifier.background(Color(0xFF323232)).padding(vertical = 10.dp)
        )
    }

}