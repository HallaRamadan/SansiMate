package com.example.sensimate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sensimate.ui.theme.SensiMateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SensiMateTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    SensiMateApp()

                }
            }
        }
    }
}
@Preview
@Composable
fun SensiMatePreview() {
    SensiMateApp()

}



@Composable
fun SensiMateApp(){

}
@Composable
fun MenuBarApp(){

}
@Composable
fun SenSiMateIcon(){

}
