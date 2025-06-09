package com.example.recetarioapp.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.recetarioapp.icons.ClockHistory
import com.example.recetarioapp.icons.Fire
import com.example.recetarioapp.icons.Layers
import com.example.recetarioapp.icons.PersonHearts
import com.example.recetarioapp.icons.StarFilled

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun RecetaDetail (recetaId: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            // Image at the top, takes most of the space
            GlideImage(
                model = "https://img.freepik.com/free-photo/salads-with-quinoa-arugula-radish-tomatoes-cucumber-bowl-wooden-table-healthy-food-diet-detox-vegetarian-concept_2829-6842.jpg",
                contentDescription = null,
                modifier = Modifier
                    .height(260.dp),
                contentScale = ContentScale.Crop,
            )
        }

        // Surface overlapping on top of the image, positioned at the bottom
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(460.dp)
                .align(Alignment.BottomCenter)
                .offset(y =  (-50).dp),
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
            color = Color.White,
            shadowElevation = 4.dp
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
                ,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // 🍽 Title Box - takes half
                        Box(
                            modifier = Modifier.weight(2f)
                                .background(color = Color.White)
                        ) {
                            Text(
                                text = "Bowl de Quinoa con Verduras",
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black,
                                textAlign = TextAlign.Start,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }

                        // ⭐ Rating Box - takes half
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                                .wrapContentSize(Alignment.CenterEnd)
                                .background(color = Color.White)
                        ) {
                            Row(
                                modifier = Modifier
                                    .background(Color.Yellow, shape = RoundedCornerShape(50))
                                    .padding(horizontal = 8.dp, vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Image(
                                    imageVector = StarFilled,
                                    contentDescription = null,
                                    modifier = Modifier.size(19.dp),
                                    colorFilter = ColorFilter.tint(Color.Black)
                                )
                                Text(
                                    text = "4.5",
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black,
                                )
                            }
                        }
                    }


                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = Color.White)
                            .padding(start = 12.dp, bottom = 15.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            text = "Food",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.LightGray
                        )
                    }

                    // the pills where it show time and serving and 2 more
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = Color.White),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Box( // pill shaped box
                            modifier = Modifier
                                .width(70.dp)
                                .height(110.dp)
                                .clip(RoundedCornerShape(75.dp))
                                .background(color = Color.Yellow)
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Box( // the circle
                                    modifier = Modifier
                                        .size(55.dp)
                                        .clip(CircleShape)
                                        .background(color = Color.White),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        imageVector = ClockHistory,
                                        contentDescription = null,
                                        colorFilter = ColorFilter.tint(Color.Black),
                                        modifier = Modifier.size(28.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.height(6.dp))

                                Column( // 💖 this wraps the 35 + min super close
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.spacedBy((-6).dp) // safe spacing control
                                ) {
                                    Text(
                                        text = "35",
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black,
                                        fontSize = 17.sp
                                    )
                                    Text(
                                        text = "min",
                                        fontWeight = FontWeight.Bold,
                                        color = Color.DarkGray,
                                        fontSize = 11.sp,
                                    )
                                }
                            }
                        }


                        Box( // pill shaped box
                            modifier = Modifier
                                .width(70.dp)
                                .height(110.dp)
                                .clip(RoundedCornerShape(75.dp))
                                .background(color = Color.Yellow)
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Box( // the circle
                                    modifier = Modifier
                                        .size(55.dp) // 💖 FIXED: use fixed size for a perfect circle
                                        .clip(CircleShape) // 💅 perfect circle shape
                                        .background(color = Color.White),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        imageVector = PersonHearts,
                                        contentDescription = null,
                                        colorFilter = ColorFilter.tint(Color.Black),
                                        modifier = Modifier.size(28.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.height(6.dp))

                                Column( // 💖 this wraps the 35 + min super close
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.spacedBy((-6).dp) // safe spacing control
                                ) {
                                    Text(
                                        text = "03",
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black,
                                        fontSize = 17.sp
                                    )
                                    Text(
                                        text = "serving",
                                        fontWeight = FontWeight.Bold,
                                        color = Color.DarkGray,
                                        fontSize = 11.sp,
                                    )
                                }
                            }
                        }



                        Box( // pill shaped box
                            modifier = Modifier
                                .width(70.dp)
                                .height(110.dp)
                                .clip(RoundedCornerShape(75.dp))
                                .background(color = Color.Yellow)
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Box( // the circle
                                    modifier = Modifier
                                        .size(55.dp) // 💖 FIXED: use fixed size for a perfect circle
                                        .clip(CircleShape) // 💅 perfect circle shape
                                        .background(color = Color.White),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        imageVector = Fire,
                                        contentDescription = null,
                                        colorFilter = ColorFilter.tint(Color.Black),
                                        modifier = Modifier.size(28.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.height(6.dp))

                                Column( // 💖 this wraps the 35 + min super close
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.spacedBy((-6).dp) // safe spacing control
                                ) {
                                    Text(
                                        text = "103",
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black,
                                        fontSize = 17.sp
                                    )
                                    Text(
                                        text = "Cal",
                                        fontWeight = FontWeight.Bold,
                                        color = Color.DarkGray,
                                        fontSize = 11.sp,
                                    )
                                }
                            }
                        }




                        Box( // pill shaped box
                            modifier = Modifier
                                .width(70.dp)
                                .height(110.dp)
                                .clip(RoundedCornerShape(75.dp))
                                .background(color = Color.Yellow)
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Box( // the circle
                                    modifier = Modifier
                                        .size(55.dp) // 💖 FIXED: use fixed size for a perfect circle
                                        .clip(CircleShape) // 💅 perfect circle shape
                                        .background(color = Color.White),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        imageVector = Layers,
                                        contentDescription = null,
                                        colorFilter = ColorFilter.tint(Color.Black),
                                        modifier = Modifier.size(28.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.height(6.dp))

                                Column( // 💖 this wraps the 35 + min super close
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.spacedBy((-6).dp) // safe spacing control
                                ) {
                                    Text(
                                        text = "Easy",
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black,
                                        fontSize = 17.sp
                                    )
                                    Text(
                                        text = "",
                                        fontWeight = FontWeight.Bold,
                                        color = Color.DarkGray,
                                        fontSize = 11.sp,
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = Color.White)
                            .padding(start = 8.dp, bottom = 10.dp, top = 10.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            text = "Ingredientes",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }

                    val ingredientes = listOf(
                        "1 taza de quinoa cocida",
                        "1/2 taza de brócoli al vapor",
                        "1/2 taza de pimientos picados",
                        "1/2 taza de zanahorias ralladas",
                        "1/4 taza de hummus",
                        "Un chorrito de aceite de oliva",
                        "Jugo de limón",
                        "Sal y pimienta al gusto"
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = Color.White)
                            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        ingredientes.forEach { ingrediente ->
                            Row(
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier.padding(bottom = 6.dp)
                            ) {
                                Text(
                                    text = "•", // 💖 bullet point
                                    fontSize = 16.sp,
                                    color = Color.Black,
                                    modifier = Modifier.padding(end = 8.dp)
                                )
                                Text(
                                    text = ingrediente,
                                    fontSize = 15.sp,
                                    color = Color.Black
                                )
                            }
                        }
                    }


                    Spacer(modifier = Modifier.height(8.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = Color.White)
                            .padding(start = 8.dp, bottom = 10.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            text = "Pasos",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }

                    val pasos = listOf(
                        "Cocina la quinoa según las instrucciones y déjala enfriar.",
                        "Cocina el brócoli al vapor hasta que esté tierno.",
                        "Arma el bowl con la quinoa, los vegetales y el hummus.",
                        "Agrega un chorrito de aceite de oliva y jugo de limón.",
                        "Condimenta con sal y pimienta.",
                        "¡Mézclalo todo y disfruta!"
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = Color.White)
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        pasos.forEachIndexed { index, paso ->
                            Row(
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier.padding(bottom = 8.dp)
                            ) {
                                Text(
                                    text = "${index + 1}.", // ✨ numbered steps
                                    fontSize = 16.sp,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(end = 8.dp)
                                )
                                Text(
                                    text = paso,
                                    fontSize = 15.sp,
                                    color = Color.Black
                                )
                            }
                        }
                    }


                    Spacer(modifier = Modifier.height(50.dp))
                }
            }
        }
    }
}