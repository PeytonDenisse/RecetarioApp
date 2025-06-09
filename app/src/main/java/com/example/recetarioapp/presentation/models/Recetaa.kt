package com.example.recetarioapp.presentation.models

data class Recipe(
    val title: String,
    val category: String,
    val imageUrl: String,
    val rating: Double,
    val time: String,
    val decription: String
)

val sampleRecipes = listOf(
    Recipe(
        title = "Chicken Curry",
        category = "Asian",
        imageUrl = "https://images.pexels.com/photos/1640777/pexels-photo-1640777.jpeg",
        rating = 4.8,
        time = "15 min",
        decription = "A spicy and flavorful chicken curry made with authentic Asian spices."
    ),
    Recipe(
        title = "Crepes with Orange",
        category = "Western",
        imageUrl = "https://images.pexels.com/photos/704569/pexels-photo-704569.jpeg",
        rating = 4.5,
        time = "35 min",
        decription = "Delicious crepes served with sweet orange sauce and whipped cream."
    ),
    Recipe(
        title = "Ramen Noodles",
        category = "Japanese",
        imageUrl = "https://images.pexels.com/photos/4916249/pexels-photo-4916249.jpeg",
        rating = 4.7,
        time = "20 min",
        decription = "Classic Japanese ramen with miso broth, noodles, and toppings."
    )
)
