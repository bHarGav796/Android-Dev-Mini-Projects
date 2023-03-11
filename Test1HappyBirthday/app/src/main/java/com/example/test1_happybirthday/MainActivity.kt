package com.example.test1_happybirthday

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test1_happybirthday.ui.theme.Test1HappyBirthdayTheme
import androidx.compose.ui.text.style.TextAlign.Companion.End
import androidx.compose.ui.text.style.TextAlign.Companion.Start

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test1HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                  BirthdayGreetingImage(message = "Happy Birthday Shukanya!", from = "-from Bhargav") //Calling the function
                  //BirthdayGreetingText("Happy Birthday Shukanya!", "-from Bhargav") //...else use

                }
            }
        }
    }
}
@Composable
fun BirthdayGreetingImage(message: String, from: String){
    val image = painterResource(id = R.drawable.androidparty)
    //1. painterResource() function loads a drawable image resource, and takes resource ID
    //2. Resources can be accessed with resource IDs that are generated in your project's R class. Here drawable is the subdirectory
    Box{
        //Use Box layout to stack elements on top of one another.
        Image(
            painter = image,
            contentDescription = null,  //Content description defines the purpose of a UI element, which makes your app more usable with TalkBack.
            modifier = Modifier //Modifiers tell a UI element how to lay out, display, or behave within its parent layout.
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop) //1. There are quite a few ContentScale types available.
                                            //2. ContentScale.Crop parameter scaling, scales the image uniformly to maintain the aspect ratio so that the width & height of the image are equal to, or larger than, the corresponding dimension of the screen.
        BirthdayGreetingText("Happy Birthday Shukanya!", "-from Bhargav") //Calling the function

    }
}
@Composable
//1. This annotation informs the compose compiler that this function is intended to convert the given instruction into UI
//2. Composable functions take in data and emit UI elements.
fun BirthdayGreetingText(message: String, from: String){ //Declaring the function
    //1. 3 basic, standard layout elements in Compose are Column, Row and Box composables
    Column{
        Text(text = message,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.Start)
                .padding(start = 16.dp, top = 16.dp)

        )//we pass 25 sp to the fontSize parameter
        //1. To display the message,use the text composable function
        //2. Next we pass the message argument

        Text(text = from,
            fontSize = 15.sp,
            modifier = Modifier//.background(color = Color.Black)
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.End)
                .padding(top = 16.dp, end = 16.dp)
        )//we use another text composable for from parameter
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "My Preview") //passing multiple parameters to the annotation
//1. This annotation creates a design preview on the screen
@Composable
fun DefaultPreview() {
    Test1HappyBirthdayTheme {
        //BirthdayGreetingText("Happy Birthday Shukanya!", "-from Bhargav") //Calling the function
        BirthdayGreetingImage(stringResource(R.string.happy_birthday_wish), stringResource(R.string.from_whome)) //Calling the function
        //1. Hardcoded string is one that's written directly in the code of your app.
        //2. Hardcoded strings make it more difficult to translate your app into other languages and reuse it in different places in our app

    }
}