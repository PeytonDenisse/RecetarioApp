package com.example.recetarioapp.presentation.Repositorio

import com.example.recetarioapp.services.ApiService
import javax.inject.Inject

class RecipeRepository @Inject constructor(private val api: ApiService) {

    suspend fun getUsuarios() = api.getUsuarios()
    suspend fun getRecetas() = api.getRecetas()
    suspend fun getCategorias() = api.getCategorias()
}