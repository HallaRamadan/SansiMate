package com.example.sensimate.ui.screens

//import java.lang.reflect.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.example.sensimate.data.Event
import com.example.sensimate.ui.components.Card


/* -------- Composable that to display Discover screen  -------*/

@Composable
fun Discover(eventList:List<Event>){

    BackgroundD {
        for (event: Event in eventList){
            Foodstuff(event)
        }
/*        SearchFieldD()
        Foodstuff("Beer from GoldStar")
        Foodstuff2("Cider from Goldstar")
        Foodstuff3("Soda from Hejsommer")
        Foodstuff4("Cola from Popi")
        Foodstuff("Beer from GoldStar")
        Foodstuff2("Cider from Goldstar")
        Foodstuff3("Soda from Hejsommer")
        Foodstuff4("Cola from Popi")*/


    }

}



@Composable
fun BackgroundD(content: @Composable () -> Unit){
    Box(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .padding(20.dp),
        contentAlignment = Alignment.TopCenter
    ){
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            content()
        }
    }
}


@Composable

fun Foodstuff(event:Event) {
    Card(modifier = Modifier
        .padding(0.dp)
        .height(150.dp), alignment = Alignment.CenterStart) {

            
            Row(
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F)

                ,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(0.3F)
                    .fillMaxSize()) {
                    Image(painterResource(event.image), contentDescription ="content description", contentScale = ContentScale.Fit, modifier = Modifier.fillMaxSize())
                }


                Column(modifier = Modifier
                    .fillMaxHeight(0.8F)
                    .fillMaxWidth(0.9F)) {
                    Row(modifier = Modifier.fillMaxHeight(0.40F)){
                        Text(text = event.title.uppercase(), color = Color.White, fontSize = 20.sp)
                    }
                    Row(modifier = Modifier.fillMaxHeight(0.33F)){
                        Column(modifier = Modifier
                            .fillMaxWidth(0.5F)) {
                            Text(text = "12/12/22", color = Color.White)
                        }
                        Column(modifier = Modifier
                            .fillMaxWidth(1F).padding(1.dp), horizontalAlignment = Alignment.End) {
                            Text(text = "1km", color = Color.White)
                        }

                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Row(modifier = Modifier.fillMaxHeight(0.50F)){
                        Text(text = "20 places left", color = Color.LightGray)
                    }
                }


                }
            }




        }


@Preview
@Composable
fun DiscoverPreview() {
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
    )
    Discover(eventList)

}