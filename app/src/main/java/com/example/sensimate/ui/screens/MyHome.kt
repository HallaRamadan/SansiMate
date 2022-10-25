package com.example.sensimate

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sensimate.ui.theme.SensiMateTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun MyEvent(
) {
    SensiMateTheme {
        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxSize().padding(20.dp),
            contentAlignment = Alignment.TopCenter
        ) {

            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                SearchField(
                    modifier = Modifier
                        .width(370.dp)
                        .height(60.dp).clip(RoundedCornerShape(120.dp))
                        .background(Color.White)
                        .alpha(0.8500000238418579f).padding(top = 0.dp),


                    )
                Box(
                    modifier = Modifier
                        .width(370.dp)
                        .height(250.dp)
                        .alpha(0.8500000238418579f).padding(top = 2.dp),
                    contentAlignment = Alignment.TopCenter


                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(1.dp)){
                        Box(modifier = Modifier
                            .width(370.dp)
                            .fillMaxHeight(0.15F)
                            .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))
                            .background(Color.White, RoundedCornerShape(20.dp)),
                            contentAlignment = Alignment.Center) {
                            Text(text = "Booked Events")
                        }
                        Box(modifier = Modifier
                            .width(370.dp)
                            .fillMaxHeight(0.85F)
                            .border(BorderStroke(1.dp, Color.Black), RoundedCornerShape(20.dp))
                            .background(Color.White, RoundedCornerShape(20.dp)),
                            contentAlignment = Alignment.TopCenter) {
                            Row(horizontalArrangement = Arrangement.spacedBy(2.dp), modifier = Modifier.padding(5.dp)){
                                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(0.33333333333F).background(Color.Red, RoundedCornerShape(20.dp)).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))){

                                }
                                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(0.50F).background(Color.Green, RoundedCornerShape(20.dp)).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))){

                                }
                                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(1F).background(Color.Blue, RoundedCornerShape(20.dp)).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))){

                                }
                            }
                        }
                    }
                }
            }


        }
    }
}
@Composable
fun SearchField(modifier: Modifier = Modifier){
    TextField(value = "", onValueChange = {}, leadingIcon = {Icon(Icons.Default.Search, contentDescription = "")}, modifier = modifier.heightIn(min = 56.dp))
}

@Composable
fun BookedEvent(){
}
@Composable
fun SavedEvent(){
}
@Composable
fun EventHistory(){
}
@Preview
@Composable
fun MyEventsPreview(){
    MyEvent()
}