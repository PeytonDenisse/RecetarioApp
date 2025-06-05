package com.example.recetarioapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recetarioapp.presentation.screens.HomeScreen
import com.example.recetarioapp.presentation.screens.RecetaDetail
import com.example.recetarioapp.presentation.ui.theme.RecetarioAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecetarioAppTheme {


                var selectedScreen by remember {
                    mutableStateOf("home")
                }

                val navController = rememberNavController()


                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF2f3a30)),
                    contentColor = Color.Transparent,
                    containerColor = Color.Transparent,

                    bottomBar = {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 24.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Surface(
                                shape = RoundedCornerShape(50),
                                color = Color(0xFFF3F8A4).copy(alpha = 0.8f),
                                shadowElevation = 8.dp
                            ) {
                                Row(
                                    modifier = Modifier
                                        .padding(horizontal = 24.dp, vertical = 8.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(24.dp)
                                ) {

                                    NavigationBarItem(
                                        selected = selectedScreen == "home",
                                        onClick = {
                                            selectedScreen = "home"
                                            navController.navigate("home")
                                        },
                                        icon = {
                                            Row(
                                                verticalAlignment = Alignment.CenterVertically,
                                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                                            ) {
                                                Icon(
                                                    imageVector = Icons.Default.Home,
                                                    tint = Color.Black,
                                                    contentDescription = "Inicio",
                                                    modifier = Modifier.size(20.dp)
                                                )
                                                Text(
                                                    text = "Inicio",
                                                    color = Color.Black,
                                                    fontSize = 14.sp
                                                )
                                            }
                                        },
                                        colors = NavigationBarItemDefaults.colors(
                                            indicatorColor = Color.Transparent
                                        ),
                                        alwaysShowLabel = false
                                    )

                                    NavigationBarItem(
                                        selected = selectedScreen == "detalle",
                                        onClick = {
                                            selectedScreen = "detalle"
                                            navController.navigate("detalle")
                                        },
                                        icon = {
                                            Row(
                                                verticalAlignment = Alignment.CenterVertically,
                                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                                            ) {
                                                Icon(
                                                    imageVector = Icons.Default.Star,
                                                    tint = Color.Black,
                                                    contentDescription = "Recetas",
                                                    modifier = Modifier.size(20.dp)
                                                )
                                                Text(
                                                    text = "Recetas",
                                                    color = Color.Black,
                                                    fontSize = 14.sp
                                                )
                                            }
                                        },
                                        colors = NavigationBarItemDefaults.colors(
                                            indicatorColor = Color.Transparent
                                        ),
                                        alwaysShowLabel = false
                                    )
                                }
                            }
                        }
                    }
                ) { innerPadding ->
                    NavHost(navController = navController, startDestination = "home") {

                        //OnClick
                        composable(route = "home") {
                            HomeScreen(innerPadding = innerPadding)
                        }

                        composable("detalle") {
                            RecetaDetail(innerPadding = innerPadding)
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hola $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RecetarioAppTheme {
        Greeting("Android")
    }
}