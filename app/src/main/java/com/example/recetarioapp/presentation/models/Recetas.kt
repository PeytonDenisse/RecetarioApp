package com.example.recetarioapp.presentation.models

data class Recetas(
    val __v: Int,
    val _id: String,
    val description: String,
    val idcategory: String,
    val image: String,
    val ingredients: List<String>,
    val name: String,
    val pasos: List<String>
)