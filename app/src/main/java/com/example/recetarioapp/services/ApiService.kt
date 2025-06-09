package com.example.recetarioapp.services

import com.example.recetarioapp.presentation.models.Categoria
import com.example.recetarioapp.presentation.models.Receta
import com.example.recetarioapp.presentation.models.Usuario
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("users")
    suspend fun getUsuarios(): List<Usuario>

    @GET("recipes")
    suspend fun getRecetas(): List<Receta>

    @GET("categories")
    suspend fun getCategorias(): List<Categoria>

    @POST("/recipes")
    suspend fun postReceta(@Body receta: Receta)

}