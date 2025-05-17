package com.example.tarea3
package com.example.articlecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articlecompose.ui.theme.ArticleComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleContent()
                }
            }
        }
    }
}

@Composable
fun ArticleContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderImage()
        Spacer(modifier = Modifier.height(16.dp))
        TitleText()
        BodyText()
    }
}

@Composable
fun HeaderImage() {
    Image(
        painter = painterResource(id = R.drawable.c8c16974d0aef074),
        contentDescription = stringResource(R.string.image_description),
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    )
}

@Composable
fun TitleText() {
    Text(
        text = stringResource(R.string.title),
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Composable
fun BodyText() {
    Text(
        text = stringResource(R.string.paragraph1),
        fontSize = 16.sp,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(bottom = 12.dp)
    )
    Text(
        text = stringResource(R.string.paragraph2),
        fontSize = 16.sp,
        textAlign = TextAlign.Justify
    )
}

