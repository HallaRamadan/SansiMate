package com.example.sensimate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.sensimate.ui.screens.RoleChoiceViewButton1
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
            SensiMateTheme  {
                Surface(
                ) {
                            MainScreen(viewModel)
                }

            }

        }


    }
}









