package com.example.recetarioapp.presentation.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.compose.AsyncImage
import com.example.recetarioapp.presentation.models.Receta
import com.example.recetarioapp.presentation.models.Recipe

@Composable
fun RecetaCard(recipe: Receta, modifier: Modifier = Modifier) {
    Column(modifier = modifier.width(180.dp)) {
        Box(
            modifier = Modifier
                .height(140.dp)
                .clip(RoundedCornerShape(16.dp))
        ) {
            // Imagen
            AsyncImage(
                model = recipe.image,
                contentDescription = recipe.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            // Etiqueta de tiempo (arriba izquierda)
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(8.dp)
                    .background(Color.Black.copy(alpha = 0.3f), RoundedCornerShape(12.dp))
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Text(
                    text = recipe.time,
                    fontSize = 12.sp,
                    color = Color.Black
                )
            }

            // Etiqueta de rating (abajo derecha)
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(8.dp)
                    .background(Color(0xFFFFC107), RoundedCornerShape(12.dp))
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Título
        Text(
            text = recipe.name,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Black,
            maxLines = 1
        )

        // Categoría
        Text(
            text = recipe.idcategory,
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray,
            maxLines = 1
        )
    }
}



@Preview(showBackground = false)
@Composable
fun PreviewRecipeCard() {

}
