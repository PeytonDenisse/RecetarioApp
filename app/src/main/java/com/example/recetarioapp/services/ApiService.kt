package com.example.recetarioapp.services

import com.example.recetarioapp.presentation.models.Categorias
import com.example.recetarioapp.presentation.models.Recetas
import com.example.recetarioapp.presentation.models.Usuarios
import retrofit2.http.GET

interface ApiService {

    @GET("usuarios")
    suspend fun getUsuarios(): List<Usuarios>

    @GET("recetas")
    suspend fun getRecetas(): List<Recetas>

    @GET("categorias")
    suspend fun getCategorias(): List<Categorias>

}