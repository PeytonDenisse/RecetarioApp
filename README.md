# RecetarioApp 🍽️

Aplicación Android desarrollada con Jetpack Compose que permite visualizar, agregar y administrar recetas, conectada a una API externa desarrollada por el equipo.

---

## 📲 Funcionalidades principales

* **Listado de recetas** con tarjetas personalizadas
* **Filtrado por categoría** desde la pantalla principal
* **Pantalla de detalle** con ingredientes y pasos
* **Agregar nueva receta** con selección de imagen desde galería
* **Marcar como favorita** y almacenamiento mediante API
* **Estadísticas**:

  * Cálculo de **promedio de calorías** por categoría
  * Cálculo de la **moda de dificultad** por categoría

---

## 🧱 Arquitectura

La app sigue los principios de **Clean Architecture**, con separación por capas:

```
├── presentation
│   ├── components      → UI reutilizable (cards, header)
│   ├── models          → Modelos de datos locales
│   ├── navigation      → Navegación entre pantallas
│   ├── screens         → Pantallas: Home, Add, Detail, Favoritos
│   ├── ui.theme        → Colores y tipografía
│   ├── viewModels      → Lógica de presentación con Hilt y StateFlow
├── services            → Conexión a API con Retrofit
```

---

## 📺 Pantallas

1. **HomeScreen**: listado de recetas filtrables por categoría
2. **AddScreen**: formulario para agregar nueva receta con imagen
3. **RecetaDetail**: vista completa de la receta
4. **FavoritesScreen**: listado de recetas marcadas como favoritas

---

## 🔌 Consumo de API

Se utiliza Retrofit con endpoints personalizados:

* `GET /recipes`, `GET /categories`, `GET /users`
* `POST /recipes`, `PATCH /recipes/{id}`

Se manejan estados de error y carga con `SharedFlow`.

---

## 📊 Estadísticas incluidas

Ubicadas en `RecetaViewModel.kt`, accesibles desde cualquier pantalla:

```kotlin
fun calcularPromedioCaloriasPorCategoria(recetas, categorias): Map<String, Double>
fun calcularModaDificultadPorCategoria(recetas, categorias): Map<String, String>
```

---

## 🧪 Requisitos cumplidos

✅ Consumo de API con Retrofit y manejo de estados
✅ Navegación entre pantallas con Jetpack Compose
✅ Diseño moderno, responsivo y visualmente atractivo
✅ Personalización de componentes (Cards, Header, Botones)
✅ Cálculos estadísticos integrados
✅ Arquitectura limpia con inyección de dependencias
✅ Participación activa y uso de GitHub en equipo

---

## 🚀 Ejecutar la app

1. Clona el repositorio
2. Asegúrate de tener una API corriendo en local/remoto
3. Ejecuta el proyecto desde Android Studio (API 33+)

---

## 📹 Entrega

* [x] Repositorio Android App ✅
* [x] Repositorio API ✅
* [x] Video de demostración ✅

---

Equipo: 
Denisse Chagoya Veloz 
Greys Alexa Almanza Vega 
Sarai Alexandra Martines
✨
