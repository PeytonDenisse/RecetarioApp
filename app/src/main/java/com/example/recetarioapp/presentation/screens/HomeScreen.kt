package com.example.recetarioapp.presentation.screens

import Header
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
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
import com.example.recetarioapp.presentation.componets.CategoryCard
import com.example.recetarioapp.presentation.models.CategoriyList
import com.example.recetarioapp.presentation.models.Category
import com.example.recetarioapp.presentation.componets.CategoryCard // ✅ correcta

@Composable
fun HomeScreen() {
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
                    .padding(16.dp)
            ) {
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
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
