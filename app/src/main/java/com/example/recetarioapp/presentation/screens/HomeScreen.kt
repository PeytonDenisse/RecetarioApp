package com.example.recetarioapp.presentation.screens

import Header
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.recetarioapp.presentation.componets.CategoryCard
import com.example.recetarioapp.presentation.models.CategoriyList
import com.example.recetarioapp.presentation.componets.RecetaCard
import com.example.recetarioapp.presentation.models.sampleRecipes

@Composable
fun HomeScreen(innerPadding: PaddingValues, navController: NavHostController
) {
    var selectedCategory by remember { mutableStateOf<String?>(null) }

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
                    .padding(innerPadding) // Respetar el espacio del Scaffold
                    .background(Color.White)
                    .padding(horizontal = 16.dp) // Espacio lateral como en HabitsScreen
            )  {
                // Categorías
                Text(
                    text = "Categorías",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.DarkGray
                )

                LazyRow(modifier = Modifier.padding(top = 8.dp)) {
                    items(CategoriyList) { category ->
                        CategoryCard(
                            category = category,
                            isSelected = selectedCategory == category.name,
                            onClick = { selectedCategory = category.name }
                        )
                    }
                }

                // Recetas populares
                Text(
                    text = "Recetas Populares",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
                )

                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(sampleRecipes) { recipe ->
                        RecetaCard(recipe = recipe)
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(innerPadding = PaddingValues(0.dp), navController = rememberNavController())
}
