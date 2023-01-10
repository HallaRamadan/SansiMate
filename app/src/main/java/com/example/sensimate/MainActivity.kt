package com.example.sensimate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sensimate.ui.theme.SensiMateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            SensiMateTheme  {
                Surface(
                ) {
                            MainScreen()
                }

            }

        }


    }
}

@Preview
@Composable
fun MainActivityPreview() {
     MainScreen()     // put it for bottom bar
}







