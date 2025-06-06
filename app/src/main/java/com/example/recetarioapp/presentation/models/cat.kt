package com.example.recetarioapp.presentation.models

data class cat(
    val name: String,
    val imageUrl: String
)

val catList= listOf(
    cat("Fast Food", "https://cdn-icons-png.flaticon.com/512/2819/2819194.png"),
    cat("Chinese", "https://cdn-icons-png.flaticon.com/512/1400/1400695.png"),
    cat("Italian", "https://images.vexels.com/media/users/3/220450/isolated/preview/984a6e47ce1687660201e8e687ac28f2-farfalle-pasta-dish-illustration.png"),
    cat("Mexican", "https://cdn-icons-png.freepik.com/512/6313/6313541.png"),
    cat("Desserts", "https://cdn4.iconfinder.com/data/icons/desserts-around-the-globe/100/Dessert_Icons_Pudding-512.png")
)

