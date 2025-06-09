package com.example.recetarioapp.presentation.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.recetarioapp.presentation.models.Receta

import com.example.recetarioapp.presentation.models.Recipe
import com.example.recetarioapp.presentation.utils.Heart

@Composable
fun RecetaCard(
    recipe: Receta,
    onClick: () -> Unit
) {
    var isFavorite by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .width(180.dp)
            .clickable { onClick() }
    ) {
        Box(
            modifier = Modifier
                .height(140.dp)
                .clip(RoundedCornerShape(16.dp))
        ) {
            AsyncImage(
                model = recipe.image,
                contentDescription = recipe.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Icon(
                imageVector = Heart,
                contentDescription = "Favorite",
                tint = if (isFavorite) Color.Red else Color.DarkGray,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(8.dp)
                    .background(Color.White.copy(alpha = 0.3f), RoundedCornerShape(50))
                    .padding(6.dp)
                    .clickable { isFavorite = !isFavorite }  // Este es independiente
            )

            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(8.dp)
                    .background(Color(0xFFFFC107), RoundedCornerShape(12.dp))
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Text(
                    text = "\uD83D\uDD52 ${recipe.time}",
                    fontSize = 12.sp,
                    color = Color.Black
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = recipe.name,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Black,
            maxLines = 1
        )

        Text(
            text = recipe.name,  // ¿Seguro que quieres mostrar el nombre dos veces? Quizás aquí va otra info.
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
