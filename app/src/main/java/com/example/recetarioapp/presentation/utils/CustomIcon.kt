package com.example.recetarioapp.presentation.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Home: ImageVector
    get() {
        if (_Home != null) return _Home!!

        _Home = ImageVector.Builder(
            name = "Home",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(8.36f, 1.37f)
                lineToRelative(6.36f, 5.8f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(13f, 6.964f)
                verticalLineToRelative(6.526f)
                lineToRelative(-0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                lineToRelative(-0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineTo(7f)
                verticalLineToRelative(3.5f)
                lineToRelative(-0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                lineToRelative(-0.5f, -0.5f)
                verticalLineTo(6.972f)
                lineTo(2f, 7.88f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(6.35f, -5.8f)
                horizontalLineToRelative(0.72f)
                close()
                moveTo(4f, 6.063f)
                verticalLineToRelative(6.927f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.5f)
                lineToRelative(0.5f, -0.5f)
                horizontalLineToRelative(3f)
                lineToRelative(0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(6.057f)
                lineTo(8f, 2.43f)
                lineTo(4f, 6.063f)
                close()
            }
        }.build()

        return _Home!!
    }

private var _Home: ImageVector? = null



val Bookmark: ImageVector
    get() {
        if (_Bookmark != null) return _Bookmark!!

        _Bookmark = ImageVector.Builder(
            name = "Bookmark",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.777f, 0.416f)
                lineTo(8f, 13.101f)
                lineToRelative(-5.223f, 2.815f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 15.5f)
                close()
                moveToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12.566f)
                lineToRelative(4.723f, -2.482f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.554f, 0f)
                lineTo(13f, 14.566f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()

        return _Bookmark!!
    }

private var _Bookmark: ImageVector? = null

