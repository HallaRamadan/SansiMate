package com.example.sensimate.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
//import java.lang.reflect.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle
import com.example.sensimate.R


/* -------- Composable that to display Disover screen  -------*/

@Composable
fun Discover(){


}


@Composable
fun DiscoverA() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(width = 414.dp)
            .height(height = 896.dp)
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.hand_beer),
            contentDescription = "Hands Beer",
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .width(width = 172.dp)
                .height(height = 115.dp))
        Image(
            painter = painterResource(id = R.drawable.cider),
            contentDescription = "cider",
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .width(width = 171.dp)
                .height(height = 115.dp))
        Image(
            painter = painterResource(id = R.drawable.coke),
            contentDescription = "coke",
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .width(width = 171.dp)
                .height(height = 115.dp))
        Image(
            painter = painterResource(id = R.drawable.cola_beverage),
            contentDescription = "cola_beverage",
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .width(width = 171.dp)
                .height(height = 115.dp))
        Box(
            modifier = Modifier
                .width(width = 414.dp)
                .height(height = 896.dp)
                .background(color = Color(0xfff9fafb)))
        // MenuBar()

        //SearchBar()
        Box(
            modifier = Modifier
                .width(width = 395.dp)
                .height(height = 171.dp)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .width(width = 395.dp)
                .height(height = 171.dp)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .width(width = 395.dp)
                .height(height = 171.dp)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .width(width = 395.dp)
                .height(height = 171.dp)
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .width(width = 116.dp)
                .height(height = 154.dp)
                .background(color = Color(0xfff9fafb)))
        Box(
            modifier = Modifier
                .width(width = 116.dp)
                .height(height = 154.dp)
                .background(color = Color(0xfff9fafb)))
        Box(
            modifier = Modifier
                .width(width = 116.dp)
                .height(height = 154.dp)
                .background(color = Color(0xfff9fafb)))
        Box(
            modifier = Modifier
                .width(width = 116.dp)
                .height(height = 154.dp)
                .background(color = Color(0xfff9fafb)))
        Text(
            text = "Beer from GoldStar ",
            color = Color(0xff121212),

            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "Cider from GoldStar ",
            color = Color(0xff121212),

            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "Soda from Hejsommer ",
            color = Color(0xff121212),

            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "Cola from Popi ",
            color = Color(0xff121212),

            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "06/11/21",
            color = Color(0xff121212),

            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "12/11/21",
            color = Color(0xff121212),

            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "11/11/21",
            color = Color(0xff121212),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "23/11/21",
            color = Color(0xff121212),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "20 places left",
            color = Color(0xff929292),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "43 places left",
            color = Color(0xff929292),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)

        Text(
            text = "31 places left",
            color = Color(0xff929292),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "31 places left",
            color = Color(0xff929292),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)

        Surface(
            color = Color.White,
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(horizontal = 7.dp,
                    vertical = 4.dp)
        ) {

        }
        Surface(
            color = Color.White,
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(horizontal = 7.dp,
                    vertical = 4.dp)
        ) {

        }
        Surface(
            color = Color.White,
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(horizontal = 7.dp,
                    vertical = 4.dp)
        ) {

        }
        Surface(
            color = Color.White,
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(horizontal = 7.dp,
                    vertical = 4.dp)
        ) {

        }
        Text(
            text = "1km",
            color = Color(0xff121212),

            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "1km",
            color = Color(0xff121212),

            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "5km",
            color = Color(0xff121212),

            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "3km",
            color = Color(0xff121212),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
    }
}

@Composable
fun MenuBar() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(width = 414.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .width(width = 414.dp)
                .height(height = 83.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(width = 414.dp)
                    .height(height = 83.dp)
                    .background(color = Color.White))
            Image(
                painter = painterResource(id = R.drawable.home_icon),
                contentDescription = "Home",
                colorFilter = ColorFilter.tint(Color.Black.copy(alpha = 0.8f)),
                modifier = Modifier
                    .size(size = 40.dp))
            Image(
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "Search",
                colorFilter = ColorFilter.tint(Color.Black.copy(alpha = 0.8f)),
                modifier = Modifier
                    .size(size = 40.dp))
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier
                    .size(size = 40.dp)
                    .padding(
                        start = 10.dp,
                        end = 10.dp,
                        top = 6.dp,
                        bottom = 7.dp
                    )
            ) {
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    modifier = Modifier
                        .width(width = 20.dp)
                        .height(height = 27.dp)
                        .padding(top = 6.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .width(width = 15.dp)
                            .height(height = 14.dp))
                    Box(
                        modifier = Modifier
                            .background(color = Color.Black)
                    ) {

                    }
                }
            }
            Box(
                modifier = Modifier
                    .width(width = 20.dp)
                    .height(height = 13.dp)
                    .padding(
                        start = 333.dp,
                        top = 41.dp
                    )
            ) {
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    modifier = Modifier
                        .width(width = 20.dp)
                        .height(height = 13.dp)
                        .padding(top = 41.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .width(width = 20.dp))
                    Spacer(
                        modifier = Modifier
                            .height(height = 6.dp))
                    Box(
                        modifier = Modifier
                            .width(width = 20.dp))
                    Spacer(
                        modifier = Modifier
                            .height(height = 6.dp))
                    Box(
                        modifier = Modifier
                            .width(width = 20.dp))
                }
            }
        }
        Box(
            modifier = Modifier
                .width(width = 149.dp)
                .height(height = 5.dp)
                .background(color = Color.Black))
    }
}



@Composable
fun SearchBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .width(width = 404.dp)
            .height(height = 44.dp)
    ) {
        Box(
            modifier = Modifier
                .width(width = 404.dp)
                .height(height = 44.dp)
                .background(color = Color.White))
        Image(
            painter = painterResource(id = R.drawable.search_button),
            contentDescription = "SearchButton",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
                .size(size = 35.dp))
        Spacer(
            modifier = Modifier
                .width(width = 5.dp))
        Text(
            text = "Search",
            color = Color(0xffcbcbcb),
            fontSize = 18.sp)

    }
}


@Composable
fun wa () {
    Row(
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(size = 26.dp))
        Spacer(
            modifier = Modifier
                .width(width = 1.dp))
        Text(
            text = "12",
            color = Color(0xff414141),

            fontSize = 18.sp)
    }
}



@Composable
fun Testable() {

    DiscoverA()
    MenuBar()
    SearchBar()
    wa()


}


@Preview
@Composable
fun DiscoverPreview(){
    Testable()


}


