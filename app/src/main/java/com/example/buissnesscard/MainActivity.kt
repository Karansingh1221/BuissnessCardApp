package com.example.buissnesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.buissnesscard.ui.theme.BuissnessCardTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BuissnessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color=MaterialTheme.colorScheme.background
                ){
                    BuissnessCardApp();
                }
            }
        }
    }
}
@Composable
fun BuissnessCardApp(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .background(Color(0xFF073042)).padding(bottom = 100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        val logo= painterResource(id = R.drawable.android_logo);
        Image(
            painter=logo,
            contentDescription = "Android Logo",
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
        )
        Text(
            text="Karan Singh",
            fontSize = 32.sp,
            color = Color.White,
        )
        Text(
            text="Android Developer Extraordinate",
            fontSize = 20.sp,
            color=Color(0xFF3ddc84)
        )
    }
    Column(
        modifier= Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp)
            .fillMaxSize().padding(bottom = 70.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
    ){
        Row(
                modifier = Modifier
                    .padding(start = 100.dp)
                    .fillMaxWidth()
        ){
            val call_logo= painterResource(id = R.drawable.ic_phone)
            Image(
                painter = call_logo,
                contentDescription = "NULL",
                modifier = Modifier
                    .padding(top = 7.dp)
                    .height(30.dp)
                    .width(21.dp)
            )
            Text(
                text="+11 (123) 444 555 666",
                modifier = Modifier.padding(8.dp),
                fontSize = 18.sp,
                color = Color.White

            )
        }
        Row(
            modifier=Modifier.fillMaxWidth().padding(start=100.dp)
        ){
            val share_logo= painterResource(id = R.drawable.ic_share);
            Image(
                painter=share_logo,
                contentDescription = "null",
                        modifier = Modifier
                        .padding(top = 7.dp)
                    .height(30.dp)
                    .width(21.dp)
            )
            Text(
                text="@AndroidDev",
                modifier = Modifier.padding(8.dp),
                fontSize = 18.sp ,
                color = Color.White

            )
        }
        Row(
            modifier=Modifier.fillMaxWidth().padding(start=100.dp)
        ){
            val mail_logo= painterResource(id = R.drawable.ic_email);
            Image(
                painter=mail_logo,
                contentDescription = "null",
                modifier = Modifier
                    .padding(top = 7.dp)
                    .height(30.dp)
                    .width(21.dp)
            )
            Text(
                text="karan12k@gmail.com",
                modifier = Modifier.padding(8.dp),
                fontSize = 18.sp,
                color = Color.White

            )
        }
    }
}
@Preview
@Composable
fun BuissnessCardPreview() {
    BuissnessCardTheme {
        BuissnessCardApp();
    }

}

