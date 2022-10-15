package com.example.jetpackcompose_app1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Space
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose_app1.ui.theme.JetPackComposeApp1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF073042)))
            {
                MyCard()
            }
        }
    }
}

@Composable
fun MyCard()
{
    val context = LocalContext.current
        Card(modifier = Modifier.padding(start = 30.dp, end = 30.dp, top = 50.dp, bottom = 50.dp),
             elevation = 10.dp,
             backgroundColor = Color.White,
             shape = RoundedCornerShape(19.dp)
        )
        {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxSize()
            ) {
                Image(painter= painterResource(id = R.drawable.myimg),
                      contentDescription = "",
                      contentScale = ContentScale.Crop,
                      modifier= Modifier
                          .size(220.dp)
                          .clip(CircleShape)
                          .align(Alignment.CenterHorizontally))

                Spacer(modifier = Modifier.padding(26.dp))
                Column(modifier = Modifier.align(CenterHorizontally)) {
                    Text(text = "Hitesh Shimpi",
                         style = TextStyle(
                             color = Color.Black,
                             fontSize = 26.sp,
                             fontFamily = FontFamily.SansSerif,
                             fontWeight = FontWeight.Bold
                         )
                    )
                    Spacer(modifier = Modifier.padding(16.dp))
                    Text(text = "TE COMP",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif)
                    )
                    Spacer(modifier = Modifier.padding(16.dp))
                    Text(text = "SITRC",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif)
                    )
                    Spacer(modifier = Modifier.padding(16.dp))
                    Text(text = "Android Development",
                        style = TextStyle(
                            color = Color.Green,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif)
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(onClick = {
                        //https://www.linkedin.com/in/hitesh-shimpi-726811161/
                        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/hitesh-shimpi-726811161/")))
                        Toast.makeText(context,"Clicked on button",Toast.LENGTH_LONG).show()
                    }) {
                        Text(text = "Click")
                    }

                }

             }


            }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyCard()
}