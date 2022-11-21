package com.example.sensimate.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Card (modifier: Modifier = Modifier, alignment:Alignment = Alignment.TopCenter, content: @Composable () -> Unit){
    Box(
        modifier = modifier
            .width(370.dp)
            .height(180.dp)
            .padding().border(
                brush = Brush.horizontalGradient(listOf(Color(0xFFED7069), Color(0xFF9F6CF1))),
                width = 3.dp,
                shape = RoundedCornerShape(18.dp)
            )        .background(Color(0xFF222222), RoundedCornerShape(20.dp))
            .alpha(0.85f),

        contentAlignment = alignment


    ) {
        content()
    }
}