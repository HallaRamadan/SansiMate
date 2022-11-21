package com.example.sensimate.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SearchField(modifier: Modifier) {
    TextField(value = "Search", onValueChange = {}, leadingIcon = { Icon(Icons.Default.Search, contentDescription = "") }, modifier = Modifier
        .width(370.dp)
        .heightIn(min = 36.dp).clip(RoundedCornerShape(120.dp))
        .background(Color.White)
        .alpha(0.85f).padding(top = 0.dp))
}