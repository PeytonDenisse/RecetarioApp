package com.example.recetarioapp.presentation.screens



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.recetarioapp.presentation.models.Receta

@Composable
fun AddRecetaScreen(
    innerPadding: PaddingValues,
    navController: NavHostController
) {
    var name by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var image by remember { mutableStateOf("") }
    var calories by remember { mutableStateOf("") }
    var serving by remember { mutableStateOf("") }
    var time by remember { mutableStateOf("") }
    var category by remember { mutableStateOf("") }
    var ingredients by remember { mutableStateOf("") }
    var steps by remember { mutableStateOf("") }

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(Color(0xFFF5F5FA))
            .verticalScroll(scrollState) // ✅ Scroll activado
            .padding(16.dp)
    ) {
        Text(
            text = "Agregar Receta",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Bloques iguales a antes
        CardSection {
            OutlinedInput("Nombre", name) { name = it }
            OutlinedInput("Descripción", description) { description = it }
            OutlinedInput("URL de Imagen", image) { image = it }
        }

        Spacer(modifier = Modifier.height(16.dp))

        CardSection {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                OutlinedInput("Calorías", calories, Modifier.weight(1f)) { calories = it }
                OutlinedInput("Porciones", serving, Modifier.weight(1f)) { serving = it }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                OutlinedInput("Tiempo", time, Modifier.weight(1f)) { time = it }
                OutlinedInput("Categoría", category, Modifier.weight(1f)) { category = it }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        CardSection {
            OutlinedInput("Ingredientes (coma)", ingredients) { ingredients = it }
            OutlinedInput("Pasos (coma)", steps) { steps = it }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                val receta = Receta(
                    _id = "",
                    __v = 0,
                    name = name,
                    description = description,
                    image = image,
                    calories = calories,
                    serving = serving,
                    time = time,
                    idcategory = category,
                    ingredients = ingredients.split(",").map { it.trim() },
                    pasos = steps.split(",").map { it.trim() }
                )
                println("Receta creada: $receta")
                navController.navigate("home") {
                    popUpTo("home") { inclusive = true }
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
        ) {
            Text("Guardar Receta", color = Color.White)
        }

        Spacer(modifier = Modifier.height(32.dp)) // Para evitar que el botón quede pegado abajo
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
