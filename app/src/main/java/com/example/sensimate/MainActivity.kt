package com.example.sensimate

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sensimate.ui.theme.SensiMateTheme
import com.example.sensimate.viewmodel.MainViewModel



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val viewModel: MainViewModel by viewModels()

        setContent {



            SensiMateTheme(viewModel.darkTheme.value)  {
                Surface(
                ) {
                            MainScreen(viewModel)
                }

            }

        }


    }
}









