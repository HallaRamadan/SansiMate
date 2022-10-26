package com.example.sensimate.ui.screens

import android.content.ClipData.Item
import android.widget.Space
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
//import java.lang.reflect.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle
import com.example.sensimate.R
import com.example.sensimate.ui.theme.SensiMateTheme



/* -------- Composable that to display Discover screen  -------*/

@Composable
fun Discover(){

    BackgroundD {
        SearchFieldD()
        Foodstuff("Beer from GoldStar")
        Foodstuff2("Cider from Goldstar")
        Foodstuff3("Soda from Hejsommer")
        Foodstuff4("Cola from Popi")
        Foodstuff("Beer from GoldStar")
        Foodstuff2("Cider from Goldstar")
        Foodstuff3("Soda from Hejsommer")
        Foodstuff4("Cola from Popi")
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
fun SearchFieldD(){
    TextField(
        value = "Search",
        onValueChange = {},
        leadingIcon = {
            Icon(Icons.Default.Search,
            contentDescription = "") },
        modifier = Modifier
            .width(370.dp)
            .heightIn(min = 36.dp)
            .clip(RoundedCornerShape(120.dp))
            .alpha(0.85f)
            .padding(top = 8.dp))
}

@Composable

fun Foodstuff(FoodstuffName: String) {
    Column(modifier = Modifier.padding(0.dp)) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .heightIn(min = 120.dp)
                .fillMaxWidth(1F)
                .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.CenterStart,



        ) {

            Row(horizontalArrangement = Arrangement.spacedBy(45.dp),
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F)
            ) {
                Row(modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(0.2F)
                    .fillMaxSize()) {
                    Image(painterResource(R.drawable.hand_beer), "content description")
                }


                Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
                    Text(text = FoodstuffName)
                    Text(text = "12/12/22", modifier = Modifier)
                    Text(text = "20 places left")
                }
                Row(
                    horizontalArrangement =
                    Arrangement.spacedBy(40.dp)

                ) {
                    Text(text = "1km")
                }

                }
            }




        }
    }


@Composable
fun Foodstuff2(FoodstuffName: String) {
    Column(modifier = Modifier.padding(0.dp)) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .heightIn(min = 120.dp)
                .fillMaxWidth(1F)
                .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.CenterStart,



            ) {

            Row(horizontalArrangement = Arrangement.spacedBy(45.dp),
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F)
            ) {
                Row(modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(0.2F)) {
                    Image(painterResource(R.drawable.cider), "content description")
                }


                Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
                    Text(text = FoodstuffName)
                    Text(text = "12/12/22", modifier = Modifier)
                    Text(text = "43 places left")
                }
                Row(
                    horizontalArrangement =
                    Arrangement.spacedBy(40.dp)

                ) {
                    Text(text = "1km")
                }

            }
        }




    }
}

@Composable
fun Foodstuff3(FoodstuffName: String) {
    Column(modifier = Modifier.padding(0.dp)) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .heightIn(min = 120.dp)
                .fillMaxWidth(1F)
                .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.CenterStart,



            ) {

            Row(horizontalArrangement = Arrangement.spacedBy(45.dp),
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F)
            ) {
                Row(modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(0.2F)) {
                    Image(painterResource(R.drawable.coke), "content description")
                }


                Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
                    Text(text = FoodstuffName)
                    Text(text = "12/12/22", modifier = Modifier)
                    Text(text = "31 places left")
                }
                Row(
                    horizontalArrangement =
                    Arrangement.spacedBy(40.dp)

                ) {
                    Text(text = "1km")
                }

            }
        }




    }
}


@Composable
fun Foodstuff4(FoodstuffName: String) {
    Column(modifier = Modifier.padding(0.dp)) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .heightIn(min = 120.dp)
                .fillMaxWidth(1F)
                .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.CenterStart,



            ) {

            Row(horizontalArrangement = Arrangement.spacedBy(55.dp),
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F)
            ) {
                Row(modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(0.2F)) {
                    Image(painterResource(R.drawable.cola_beverage), "content description")
                }


                Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
                    Text(text = FoodstuffName)
                    Text(text = "12/12/22", modifier = Modifier)
                    Text(text = "39 places left")
                }
                Row(
                    horizontalArrangement =
                    Arrangement.spacedBy(40.dp)

                ) {
                    Text(text = "1km")
                }

            }
        }




    }
}

@Preview
@Composable
fun DiscoverPreview(){
    Discover()


}


