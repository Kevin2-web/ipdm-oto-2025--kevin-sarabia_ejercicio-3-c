package com.example.tarea4

package com.example.tarjetapersonal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapersonal.ui.theme.TarjetaPersonalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPersonalTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ProfileCard()
                }
            }
        }
    }
}

@Composable
fun ProfileCard() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .border(3.dp, Color(0xFF00796B), RoundedCornerShape(16.dp))
                .background(Color(0xFFF1F8E9), RoundedCornerShape(16.dp))
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Perfil",
                tint = Color(0xFF00796B),
                modifier = Modifier
                    .size(72.dp)
                    .background(Color.White, shape = CircleShape)
                    .padding(12.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "SOFÍA MARTÍNEZ",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF004D40)
            )

            Text(
                text = "Diseñadora UX/UI",
                fontSize = 16.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Correo",
                    tint = Color(0xFF00796B),
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "sofia.mtz@email.com",
                    fontSize = 14.sp
                )
            }
        }
    }
}
