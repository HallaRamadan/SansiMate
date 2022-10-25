package com.example.sensimate.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.Text
/* -------- Composable that to display Disover screen  -------*/

@Composable
fun Discover(){
    ProductList()

}

@Composable
fun ProductList() {

    LazyColumn {
        // Add a single item
        item {
            Text(text = "First item")
        }

        // Add 5 items
        items(5) { index ->
            Text(text = "Item: $index")
        }

        // Add another single item
        item {
            Text(text = "Last item")
        }
    }
}



@Preview
@Composable
fun DiscoverPreview(){
    Discover()

}


