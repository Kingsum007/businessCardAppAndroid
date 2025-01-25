package com.sum.bussinesscardapp

import android.content.Intent
import android.graphics.fonts.Font
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sum.bussinesscardapp.ui.theme.BussinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BussinessCardAppTheme {
                Surface {
                    businessCard(modifier = Modifier.padding(16.dp))
                }
            }
        }
    }
}
@Composable
fun businessCard (modifier:Modifier = Modifier) {
    val context = LocalContext.current
    val offset = Offset(5.0f, 10.0f)
    Box(modifier = Modifier.fillMaxSize().background(color = Color(0xFF2F3C4F))) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom=12.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Column(modifier = Modifier.fillMaxHeight().align(Alignment.CenterVertically), verticalArrangement = Arrangement.Center) {
                Row (modifier = Modifier.clip(CircleShape).align(Alignment.CenterHorizontally), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(R.drawable.safi), contentDescription = null,Modifier.size(190.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(8.dp))
                Row(modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally), horizontalArrangement = Arrangement.Center) {
                    Text(
                        text = "Safi Ullah Mirzai",
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 32.sp,
                            color = Color.White,
                            shadow = Shadow(color = Color.Black, offset = offset, blurRadius = 3f)
                        )
                    )
                }
                Spacer(modifier = Modifier.padding(8.dp))
                Row(modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally), horizontalArrangement = Arrangement.Center) {
                    Text(
                        text = "Software Engineer & Lecturer",
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 24.sp,
                            color=Color.White,
                            shadow = Shadow(color = Color(0xFF506F86), offset = offset, blurRadius = 3f)
                        )
                    )
                }
                Spacer(modifier = Modifier.padding(8.dp))
                Row(modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally), horizontalArrangement = Arrangement.Center) {
                    Text(
                        text = "National Institute of Management and Administration",
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 18.sp,
                            color=Color.White,
                            shadow = Shadow(color = Color(0xFF506F86), offset = offset, blurRadius = 3f)
                        )
                    )
                }
            }

        }
        Spacer(modifier = Modifier.padding(8.dp))
        Row(
            modifier = Modifier.fillMaxHeight().align(Alignment.TopCenter).padding(bottom=32.dp),
            verticalAlignment = Alignment.Bottom
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally), horizontalArrangement = Arrangement.Center) {


Button(onClick={
    val intent = Intent(Intent.ACTION_DIAL).apply{
        data = Uri.parse("tel:+93788070101")
    }
    context.startActivity(intent)
}){
    Icon(Icons.Default.Phone, contentDescription = "Phone", modifier = Modifier.size(24.dp))
    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "+93788070101",
                        style=TextStyle(
                            fontSize= 18.sp,
                        ),
                        textAlign = TextAlign.Center
                    )
                }}
                Row(modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally), horizontalArrangement = Arrangement.Center) {

            Button(onClick = {
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("https://www.github.com/kingsum007")
                }
                context.startActivity(intent)
            })
                    {
                        Icon(Icons.Default.Share, contentDescription = "Share", modifier = Modifier.size(24.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "github.com/kingsum007",
                            style=TextStyle(
                                fontSize= 18.sp,
                            ),
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Row(modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally), horizontalArrangement = Arrangement.Center) {
                    Button(onClick = {
                        val intent = Intent(Intent.ACTION_SENDTO).apply {
                            data =
                                Uri.parse("mailto:sumirzai@gmai.com")
                            putExtra(Intent.EXTRA_SUBJECT, "Hello!")
                            putExtra(Intent.EXTRA_TEXT, "I wanted to reach out.")
                        }
                        context.startActivity(intent)
                    }) {

                        Icon(Icons.Default.Email, contentDescription = "Email", modifier = Modifier.size(24.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "sumirzai@gmail.com",
                            style=TextStyle(
                                fontSize= 18.sp,
                            ),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

    }

}


@Preview(showBackground = true)
@Composable
 fun businessCard() {

    BussinessCardAppTheme {
        businessCard(modifier = Modifier.padding(8.dp))
    }
}