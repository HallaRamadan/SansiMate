package com.example.sensimate.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Background(content: @Composable () -> Unit){
    Box(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .fillMaxHeight()
            .padding(15.dp),
        contentAlignment = Alignment.TopCenter
    ){
        Column(modifier = Modifier.shadow(20.dp, spotColor = Color(0xFF222222)), verticalArrangement = Arrangement.spacedBy(10.dp)) {
            content()
        }
    }
}