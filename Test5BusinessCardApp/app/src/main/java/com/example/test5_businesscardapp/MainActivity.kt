package com.example.test5_businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.test5_businesscardapp.ui.theme.Test5BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test5BusinessCardAppTheme {
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
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .background(Color.DarkGray)) {
        //Logo, name, title
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {

            val imageAndroid = painterResource(id = R.drawable.android_logo)
            Image(painter = imageAndroid, contentDescription = null,
            modifier = Modifier.fillMaxWidth(0.2F))

            Text(text = "Bhargav Phukan",
                color = Color.White,
                fontSize = 40.sp
            )

            Text(text = "Android Developer",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3ddc84)
            )
            
        }
        //Contact Information
        Column(verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()){

            Row(Modifier.fillMaxWidth()){
                val imagePhone = painterResource(id = R.drawable.phone)
                Image(painter = imagePhone, contentDescription = null,
                    modifier = Modifier.fillMaxWidth(.2F)
                )
                Text(text ="+91 7099573859",
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Row(Modifier.fillMaxWidth()) {
                val imageShare = painterResource(id = R.drawable.share)
                Image(painter = imageShare, contentDescription = null,
                    modifier = Modifier.fillMaxWidth(.2F)
                )
                Text(text = "@bhargav",
                    color = Color.White, modifier = Modifier.fillMaxWidth()
                )
            }

            Row(Modifier.fillMaxWidth()) {
                val imageMail = painterResource(id = R.drawable.envelope)
                Image(painter = imageMail, contentDescription = null,
//                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxWidth(.2F)
                )
                Text(text = "phukan.bhargav796@gmail.com",
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth()
                )
            }

        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Test5BusinessCardAppTheme {
        Display()
    }
}