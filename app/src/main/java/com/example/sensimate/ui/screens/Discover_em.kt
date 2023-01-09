package com.example.sensimate.ui.screens_employee

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sensimate.R
import com.example.sensimate.model.Event
import com.example.sensimate.ui.components.Card
import com.example.sensimate.ui.components.Background

/*
@Preview(showBackground = true)
@Composable
fun Discover_emPreview(){
    val eventList = listOf(
        Event(id = 1,
            title = "Beer from GoldStar",
            date = "12/12/2022",
            image = R.drawable.hand_beer, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 2,
            title = "Cider from Goldstar",
            date = "12/12/2022",
            image = R.drawable.coke, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 3,
            title = "Soda from Hejsommer",
            date = "12/12/2022",
            image = R.drawable.cider, street = "FakeStreet 123",
            town = "Fake",
            postcode = 123,
            country = "Denmark"),
        Event(id = 4,
            title = "Cola from Popi",
            date = "23/11/21",
            image=R.drawable.cola_beverage,
            street= "FakeStreet 123",
            town = "Fake",
        postcode = 123,
            country = "Denmark")
    )

    Discover_em(eventList)
}

@Composable
fun Discover_em(eventList:List<Event>){
  Background {
      //SensiMateImage()
      for (event: Event in eventList){
          Foodstuff_toAll(event)
      }
  }
}
@Composable
fun BackgroundD ( content:@Composable ()->Unit){
    Box(
        modifier = Modifier

            .width(350.dp)
            .fillMaxHeight(300.4F)
            .border(BorderStroke(1.dp, Color.Black), RoundedCornerShape(20.dp))
    ){
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            content()
        }
    }
}

@Composable
fun SensiMateImage() {
    Box(contentAlignment = Alignment.Center) {
        Row(horizontalArrangement = Arrangement.spacedBy(2.dp),
            modifier = Modifier.padding(3.dp)
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Image(
                painter = painterResource(R.drawable.sensimatelogo),
                modifier = Modifier.width(200.dp),
                contentDescription = null,
                alignment = Alignment.Center)
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}



@Composable

fun Foodstuff_toAll(event:Event) {
    Card(modifier = Modifier
        .padding(0.dp)
        .height(150.dp), alignment = Alignment.CenterStart) {


        Row(
            modifier = Modifier
                .fillMaxHeight(1F)
                .fillMaxWidth(1F),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(modifier = Modifier
                .fillMaxHeight(1F)
                .fillMaxWidth(0.3F)
                .fillMaxSize()) {
                Image(painterResource(event.image),
                    contentDescription = "content description",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxSize())
            }


            Column(modifier = Modifier
                .fillMaxHeight(0.8F)
                .fillMaxWidth(0.9F)) {
                Row(modifier = Modifier.fillMaxHeight(0.40F)) {
                    Text(text = event.title.uppercase(), color = Color.White, fontSize = 20.sp)
                }
                Row(modifier = Modifier.fillMaxHeight(0.33F)) {
                    Column(modifier = Modifier
                        .fillMaxWidth(0.5F)) {
                        Text(text = "12/12/22", color = Color.White)
                    }
                    Column(modifier = Modifier
                        .fillMaxWidth(1F)
                        .padding(1.dp), horizontalAlignment = Alignment.End) {
                        Text(text = "1km", color = Color.White)
                    }

                }
                Spacer(modifier = Modifier.weight(1f))
                Row(modifier = Modifier.fillMaxHeight(0.50F)) {
                    Text(text = "20 places left", color = Color.LightGray)
                }
            }


        }
    }
}


 */