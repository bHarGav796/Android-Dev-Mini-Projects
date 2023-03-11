package com.example.test4_composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test4_composequadrant.ui.theme.Test4ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test4ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Display()
                }
            }
        }
    }
}

@Composable
fun Display() {
    Column {
        //This is Row 1
        Row(modifier = Modifier.weight(1f)){

            //This is modification for the first quadrant
            Column( modifier = Modifier
                .weight(1f)
                .fillMaxSize(1f)
                .background(Color.Green)
                .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Text(text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "Displays text and follows Material Design guidelines.")
            }

            //This is modification for the second quadrant
            Column( modifier = Modifier
                .weight(1f)
                .fillMaxSize(1f)
                .background(Color.Yellow)
                .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Text(text = "Image composable",
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(text = "Creates a composable that lays out and draws a given Painter class object.",
                    modifier = Modifier.padding(bottom = 16.dp))

            }
        }
        //This is Row 2
        Row(modifier = Modifier.weight(1f)){

            //This is modification for third quadrant
            Column( modifier = Modifier
                .weight(1f)
                .fillMaxSize(1f)
                .background(Color.Cyan)
                .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Text(text = "Row composable",
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "A layout composable that places its children in a horizontal sequence.")

            }
            //This is modification for fourth quadrant
            Column( modifier = Modifier
                .weight(1f)
                .fillMaxSize(1f)
                .background(Color.Gray)
                .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Text(text  = "Column composable",
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(text = "A layout composable that places its children in a vertical sequence.")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Test4ComposeQuadrantTheme {
        Display()
    }
}