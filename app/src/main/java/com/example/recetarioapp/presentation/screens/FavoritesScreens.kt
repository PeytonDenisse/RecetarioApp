package com.example.recetarioapp.presentation.screens

import Header
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.recetarioapp.presentation.componets.FavoriteCard
import com.example.recetarioapp.presentation.models.Recipe
import com.example.recetarioapp.presentation.models.sampleRecipes

@Composable
fun FavoritesScreens(
    innerPadding: PaddingValues,
    navController: NavHostController,
    favorites: List<Recipe> = sampleRecipes // reemplazar luego con favoritos reales
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Header()
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 160.dp),
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
            color = Color.White,
            shadowElevation = 4.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(Color.White)
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = "Favoritos",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.Black,
                    modifier = Modifier.padding(vertical = 16.dp)
                )

                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(favorites) { receta ->
                        FavoriteCard(
                            recipe = receta,
                            onActionClick = {
                                navController.navigate("detail/${receta.title}") // o receta.id si tienes uno
                            }
                        )
                    }
                }
            }
        }
    }
}
