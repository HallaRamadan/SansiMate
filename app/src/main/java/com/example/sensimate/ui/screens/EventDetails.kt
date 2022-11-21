package com.example.sensimate.ui.screens

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sensimate.BottomBarScreen.Discover.title
import com.example.sensimate.R
import com.example.sensimate.ui.components.Card
import com.example.sensimate.ui.components.Background


@Composable
fun EventDetails() {
    Background {
        Card(
            modifier = Modifier
                .padding(0.dp).height(500.dp)
                .fillMaxHeight(), alignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(1F),
            ) {
                Row(modifier = Modifier.fillMaxHeight(1F)) {
                    Column {
                        Text(
                            text = " \n\n\n Beer from GoldStar",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                        Text(text = " 06/11/21", color = Color.White, fontSize = 18.sp)
                        Text(text = " 20 places left\n", color = Color.White, fontSize = 18.sp)
                        Text(text = " Allergens", color = Color.White, fontSize = 20.sp)
                        Text(text = " N/A", color = Color.White, fontSize = 18.sp)
                        Image(
                            painterResource(R.drawable.mapdiscover), "ContentDescription",
                            contentScale = ContentScale.Fit,
                            modifier =
                            Modifier
                                .fillMaxWidth(1F)
                                .fillMaxHeight(0.65F)
                        )
                        Text(
                            text = "                       Check Results",
                            color = Color.Magenta,
                            fontSize = 20.sp
                        )
                        Text(
                            text = "                       Edit Survey",
                            color = Color.Magenta,
                            fontSize = 20.sp
                        )
                    }

                }
            }
        }
    }
}

@Composable
@Preview
fun EventDetailsPreview(){
    EventDetails()
}