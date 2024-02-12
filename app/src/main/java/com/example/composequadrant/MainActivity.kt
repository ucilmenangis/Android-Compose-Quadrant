package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant(
                        nameColumnBox1 = getString(R.string.text_composable),
                        textColumnBox1 = getString(R.string.content_text_composable),
                        nameColumnBox2 = getString(R.string.image_composable),
                        textColumnBox2 = getString(R.string.content_image_composable),
                        nameColumnBox3 = getString(R.string.row_composable),
                        textColumnBox3 = getString(R.string.content_row_composable),
                        nameColumnBox4 = getString(R.string.column_composable),
                        textColumnBox4 = getString(R.string.content_column_composable)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(
    nameColumnBox1 : String,
    textColumnBox1 : String ,
    nameColumnBox2 : String,
    textColumnBox2 : String ,
    nameColumnBox3 : String,
    textColumnBox3 : String ,
    nameColumnBox4 : String,
    textColumnBox4 : String ,
    modifier: Modifier = Modifier
) {
    Box {
        Column (
            modifier = modifier
                .fillMaxWidth()
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = modifier
                    .weight(1f)
            ) {
                Column (
                    verticalArrangement = Arrangement.Center,
                    modifier = modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(Color(0xFFEADDFF))
                ){
                    textContent(nameColumnBox = nameColumnBox1, textColumnBox = textColumnBox1)
                }
                Column (
                    verticalArrangement = Arrangement.Center,
                    modifier = modifier
                        .fillMaxSize()
                        .weight(1f)
                        .background(Color(0xFFD0BCFF))
                ){
                    textContent(nameColumnBox = nameColumnBox2, textColumnBox = textColumnBox2)
                }
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = modifier
                    .weight(1f)
            ) {
                Column (
                    verticalArrangement = Arrangement.Center,
                    modifier = modifier
                        .background(Color(0xFFB69DF8))
                        .fillMaxSize()
                        .weight(1f)
                ){
                    textContent(
                        nameColumnBox = nameColumnBox3,
                        textColumnBox = textColumnBox3,
                    )
                }
                Column (
                    verticalArrangement = Arrangement.Center,
                    modifier = modifier
                        .background(Color(0xFFF6EDFF))
                        .fillMaxSize()
                        .weight(1f)
                ){
                    textContent(
                        nameColumnBox = nameColumnBox4,
                        textColumnBox = textColumnBox4,
                    )
                }
            }
        }
    }
}

@Composable
fun textContent (nameColumnBox: String , textColumnBox: String , modifier: Modifier = Modifier){
    Text(
        text = "$nameColumnBox",
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        fontSize = 16.sp,
        modifier = modifier
            .padding(15.dp)
    )
    Text(
        text = "$textColumnBox",
        textAlign = TextAlign.Justify,
        color = Color.Black,
        modifier = modifier
            .padding(15.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
    }
}