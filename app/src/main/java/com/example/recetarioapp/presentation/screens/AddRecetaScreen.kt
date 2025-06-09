package com.example.recetarioapp.presentation.screens



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun AddRecetaScreen(
    innerPadding: PaddingValues,
    navController: NavHostController
) {
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var ingredients by remember { mutableStateOf(TextFieldValue("")) }
    var description by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(16.dp)
    ) {
        Text(
            text = "Agregar Receta",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nombre de la receta") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = ingredients,
            onValueChange = { ingredients = it },
            label = { Text("Ingredientes") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Descripción") },
            modifier = Modifier.fillMaxWidth(),
            maxLines = 4
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                // Aquí puedes guardar la receta
                // Y redirigir a otra pantalla si deseas
                navController.navigate("home") {
                    popUpTo("home") { inclusive = true }
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Guardar Receta")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AddRecipeScreenPreview() {
    val fakeNavController = rememberNavController()
    AddRecetaScreen(
        innerPadding = PaddingValues(0.dp),
        navController = fakeNavController
    )
}
