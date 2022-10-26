package com.example.sensimate.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sensimate.R


@Preview
@Composable
fun Discover_DetailPreview() {
        DiscoverDetailCard {
            Column(verticalArrangement = Arrangement.spacedBy(0.1.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(1F)
                        .fillMaxHeight(0.25F)
                        .padding()
                        .alpha(0.85f)
                        .background(Color.White)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        modifier = Modifier.padding(3.dp)
                    ) {
                        Text(text = "Beer From Goldstar\n" + "21/10/2022\n" + "20 places left")
                        Image(painterResource(R.drawable.hand_beer), "content description")
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth(1F)
                        .fillMaxHeight(0.33F)
                        .padding()
                        .alpha(0.85f)
                        .background(Color.White),
                ) {
                    Text(text = "Allergens\n" + "N/A")
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth(1F)
                        .fillMaxHeight(0.15F)
                        .padding()
                        .alpha(0.85f)
                        .background(Color.White)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(80.dp),
                        modifier = Modifier.padding(3.dp)
                    ) {
                        Text(text = "Million Bar")
                        Text(text = "1km")
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth(1F)
                        .fillMaxHeight(1F)
                        .padding()
                        .alpha(0.85f)
                        .background(Color.White)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(100.dp),
                        modifier = Modifier.padding(3.dp)
                    ) {
                        Image(painterResource(R.drawable.mapdiscover), "content discription")
                    }
                }
            }
        }
}

@Composable
fun DiscoverDetailCard (content: @Composable () -> Unit) {
        Box(
            modifier = Modifier
                .width(190.dp)
                .height(300.dp)
                .padding()
                .alpha(0.85f),

            contentAlignment = Alignment.TopCenter


        ) {
            content()
        }
    }

/*@Composable
fun BackSave(){
CardTitle(title = "Back")

}

@Composable
fun eventDetail(){
    CardTitle(title = "Beer from Goldstar")

}

@Composable
fun Allergens(){
    CardTitle(title = "Allergens")

}

@Composable
fun Map(){
    CardTitle(title = "Million Bar")

}

 */