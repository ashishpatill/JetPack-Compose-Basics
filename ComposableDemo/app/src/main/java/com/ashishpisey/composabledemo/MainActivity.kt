package com.ashishpisey.composabledemo

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashishpisey.composabledemo.ui.theme.ComposableDemoTheme
import com.ashishpisey.composabledemo.ui.theme.DarkGreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Box() {
        BirthdayGreetingWithImage()
        BirthdayGreetingWithText(title = stringResource(R.string.happy_birthday_title), to = "Akash", from = stringResource(
                    R.string.from_subtitle)
                )
    }
}

@Composable
fun BirthdayGreetingWithText(title:String, to: String, from: String) {
    Column(
        Modifier
            .wrapContentSize()) {
        Text(
            text = "$title $to!",
            color = Color.Black,
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.Start)
                .padding(start = 16.dp, top = 16.dp)
        )
        Text(text = "- from: $from",
            color = Color.Black,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp))
    }
}

@Composable
fun BirthdayGreetingWithImage() {
    val image = painterResource(id = R.drawable.androidparty)
    Image(painter = image,
          contentDescription = null,
          modifier = Modifier
              .fillMaxHeight()
              .fillMaxWidth(),
          contentScale = ContentScale.Crop)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}