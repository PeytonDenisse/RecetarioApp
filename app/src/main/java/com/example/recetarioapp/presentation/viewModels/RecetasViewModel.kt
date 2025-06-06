package com.example.recetarioapp.presentation.viewModels

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recetarioapp.presentation.models.Categorias
import com.example.recetarioapp.presentation.models.Recetas
import com.example.recetarioapp.presentation.models.Usuarios
import com.example.recetarioapp.services.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(
    private val apiService: ApiService

) : ViewModel() {

    private val _recetasFlow = MutableSharedFlow<List<Recetas>>()
    val recetasFlow = _recetasFlow.asSharedFlow()

    private val _categoriasFlow = MutableSharedFlow<List<Categorias>>()
    val categoriasFlow = _categoriasFlow.asSharedFlow()

    private val _usuariosFlow = MutableSharedFlow<List<Usuarios>>()
    val usuariosFlow = _usuariosFlow.asSharedFlow()

    private val _errorFlow = MutableSharedFlow<String>()
    val errorFlow = _errorFlow.asSharedFlow()

    init {
        obtenerRecetas()
        obtenerCategorias()
        obtenerUsuarios()
    }

    fun obtenerRecetas() {
        viewModelScope.launch {
            try {
                val recetas = apiService.getRecetas()
                _recetasFlow.emit(recetas)
            } catch (e: Exception) {
                _errorFlow.emit("Error cargando recetas")
            }
        }
    }

    fun obtenerCategorias() {
        viewModelScope.launch {
            try {
                val cats = apiService.getCategorias()
                _categoriasFlow.emit(cats)
            } catch (e: Exception) {
                _errorFlow.emit("Error cargando categorías")
            }
        }
    }

    fun obtenerUsuarios() {
        viewModelScope.launch {
            try {
                val usuarios = apiService.getUsuarios()
                _usuariosFlow.emit(usuarios)
            } catch (e: Exception) {
                _errorFlow.emit("Error cargando usuarios")
            }
        }
    }
}


