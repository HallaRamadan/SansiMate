package com.example.sensimate

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.sensimate.ui.screens.RoleChoiceViewButton
import com.example.sensimate.ui.theme.SensiMateTheme
import com.example.sensimate.ui.theme.color1
import com.example.sensimate.ui.theme.color2
import com.example.sensimate.viewmodel.MainViewModel
//import com.google.android.gms.tasks.OnFailureListener
//import com.google.android.gms.tasks.OnSuccessListener
//import com.google.firebase.firestore.DocumentReference
// import com.google.firebase.firestore.FirebaseFirestore


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val viewModel: MainViewModel by viewModels()

        setContent {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                RoleChoiceViewButton(
                    text = "Admain",
                    textColor = Color.White ,
                    rolechoiceview = Brush.horizontalGradient(
                        colors = listOf(
                            color1,
                            color2
                        )
                    )
                )
                { }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Admain")
                }

            }



            SensiMateTheme  {
                Surface(
                ) {
                            MainScreen(viewModel)
                }

            }

        }


    }
}









