package com.example.translatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.translatorapp.ui.theme.TranslatorAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TranslatorAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Greeting()

                        // Button for capturing the screen
                        Button(
                            onClick = {
                                // Handle screen capture logic here
                            },
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Text(text = "Capture Screen")
                        }

                        // Button for translating text
                        Button(
                            onClick = {
                                // Handle translation logic here
                            },
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Text(text = "Translate")
                        }

                    }
                }
            }
        }
    }

    @Composable
    fun Greeting() {
        Text(
            text = "Welcome to Scanlator",

        )
    }
}



