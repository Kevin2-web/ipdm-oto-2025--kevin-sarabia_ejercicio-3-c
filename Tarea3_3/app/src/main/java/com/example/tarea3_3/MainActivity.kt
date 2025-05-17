package com.example.tarea3_3

package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    InfoGrid()
                }
            }
        }
    }
}

@Composable
fun InfoGrid() {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            InfoCard(
                heading = "Título",
                body = "Componente que muestra un texto personalizado según el diseño actual.",
                color = Color(0xFFCCE5FF),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                heading = "Imagen",
                body = "Permite colocar una imagen usando un objeto Painter dentro del diseño.",
                color = Color(0xFFFFF5CC),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            InfoCard(
                heading = "Fila",
                body = "Organiza los elementos en una línea horizontal de izquierda a derecha.",
                color = Color(0xFFD6FFCC),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                heading = "Columna",
                body = "Acomoda los elementos de forma vertical, uno debajo del otro.",
                color = Color(0xFFFFCCCC),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun InfoCard(
    heading: String,
    body: String,
    color: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(12.dp)
            .background(color),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = heading,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = body,
            fontSize = 14.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(horizontal = 12.dp),
            lineHeight = 18.sp
        )
    }
}
