package com.example.cameraxcompose

import CameraComposable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cameraxcompose.camerax.CameraX
import com.example.cameraxcompose.ui.theme.CameraXComposeTheme

class MainActivity : ComponentActivity() {
    private var cameraX: CameraX = CameraX(this, this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CameraXComposeTheme {
                CameraComposable(context = this, cameraX = cameraX) {
                    cameraX.takePhoto()
                }
            }
        }
    }
}