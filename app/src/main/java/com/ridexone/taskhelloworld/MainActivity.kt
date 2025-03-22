package com.ridexone.taskhelloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.ridexone.taskhelloworld.ui.theme.TaskHelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskHelloWorldTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android Emulator",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Center the text in the screen using a Box with alignment
    androidx.compose.foundation.layout.Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center // Center the content within the Box
    ) {
        Text(
            text = "Hello $name!",
            fontSize = 30.sp, // Set font size to 30sp
            fontWeight = FontWeight.Bold // Set text to bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskHelloWorldTheme {
        Greeting("Android")
    }
}
