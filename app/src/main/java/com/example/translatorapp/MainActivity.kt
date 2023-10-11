package com.example.translatorapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.translatorapp.ui.theme.TranslatorAppTheme


class MainActivity : ComponentActivity() {

    private val activityResultLauncher: ActivityResultLauncher<Array<String>> = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions: Map<String, Boolean> ->
        // Handle Permission granted/rejected
        var permissionGranted = true
        permissions.entries.forEach {
            if (it.key in REQUIRED_PERMISSIONS && it.value == false) {
                permissionGranted = false
            }
        }
        if (!permissionGranted) {
            Toast.makeText(baseContext, "Permission request denied", Toast.LENGTH_SHORT).show()
        } else {
            // Permission granted, start your camera logic here
            startCamera()
        }
    }

    private fun startCamera() {
        TODO("Not yet implemented")
    }

    private val REQUIRED_PERMISSIONS = listOf(
        android.Manifest.permission.CAMERA,
        android.Manifest.permission.WRITE_EXTERNAL_STORAGE,
        // Add other required permissions here
    )

    // Create a method to request permissions
    private fun requestPermissions() {
        activityResultLauncher.launch(REQUIRED_PERMISSIONS.toTypedArray())
    }


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
                                // Request permissions for camera access
                                requestPermissions()
                            },
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Text(text = "Camera")
                        }


                        // Button for translating text
                        Button(
                            onClick = {
                                // Handle translation logic here
                            },
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Text(text = "Capture Screen")
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



