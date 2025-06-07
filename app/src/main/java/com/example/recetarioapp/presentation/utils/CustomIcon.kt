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




val Heart: ImageVector
    get() {
        if (_HeartFilled != null) return _HeartFilled!!

        _HeartFilled = ImageVector.Builder(
            name = "HeartFilled",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(14.88f, 4.78079f)
                curveTo(14.7993f, 4.46498f, 14.6748f, 4.16202f, 14.51f, 3.88077f)
                curveTo(14.3518f, 3.58819f, 14.1493f, 3.3217f, 13.91f, 3.09073f)
                curveTo(13.563f, 2.74486f, 13.152f, 2.46982f, 12.7f, 2.28079f)
                curveTo(11.7902f, 1.90738f, 10.7698f, 1.90738f, 9.85999f, 2.28079f)
                curveTo(9.43276f, 2.46163f, 9.04027f, 2.71541f, 8.70002f, 3.03079f)
                lineTo(8.65003f, 3.09073f)
                lineTo(8.00001f, 3.74075f)
                lineTo(7.34999f, 3.09073f)
                lineTo(7.3f, 3.03079f)
                curveTo(6.95975f, 2.71541f, 6.56726f, 2.46163f, 6.14002f, 2.28079f)
                curveTo(5.23018f, 1.90738f, 4.20984f, 1.90738f, 3.3f, 2.28079f)
                curveTo(2.84798f, 2.46982f, 2.43706f, 2.74486f, 2.09004f, 3.09073f)
                curveTo(1.85051f, 3.32402f, 1.64514f, 3.59002f, 1.48002f, 3.88077f)
                curveTo(1.32258f, 4.1644f, 1.20161f, 4.46682f, 1.12f, 4.78079f)
                curveTo(1.03522f, 5.10721f, 0.994861f, 5.44358f, 1.00001f, 5.78079f)
                curveTo(1.00053f, 6.09791f, 1.04084f, 6.41365f, 1.12f, 6.72073f)
                curveTo(1.20384f, 7.03078f, 1.32472f, 7.32961f, 1.48002f, 7.61075f)
                curveTo(1.64774f, 7.89975f, 1.85285f, 8.16542f, 2.09004f, 8.40079f)
                lineTo(8.00001f, 14.3108f)
                lineTo(13.91f, 8.40079f)
                curveTo(14.1471f, 8.16782f, 14.3492f, 7.90169f, 14.51f, 7.61075f)
                curveTo(14.6729f, 7.33211f, 14.7974f, 7.03272f, 14.88f, 6.72073f)
                curveTo(14.9592f, 6.41365f, 14.9995f, 6.09791f, 15f, 5.78079f)
                curveTo(15.0052f, 5.44358f, 14.9648f, 5.10721f, 14.88f, 4.78079f)
                close()
            }
        }.build()

        return _HeartFilled!!
    }

private var _HeartFilled: ImageVector? = null



