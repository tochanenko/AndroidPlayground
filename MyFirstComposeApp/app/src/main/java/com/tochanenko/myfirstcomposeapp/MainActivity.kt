package com.tochanenko.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.tochanenko.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Hello(name = "Red Android", color = Color.Red)
                        Hello(name = "Green Android", color = Color.Green)
                        Hello(name = "Blue Android", color = Color.Blue)
                    }

                }
            }
        }
    }
}

@Composable
fun Hello(name: String, modifier: Modifier = Modifier, color: Color = Color.Black) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        color = color,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun HelloPreview() {
    MyFirstComposeAppTheme {
        Hello(
            name = "There",
            color = Color.Magenta
        )
    }
}