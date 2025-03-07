package com.example.foodapp.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val PersonCircle: ImageVector
    get() {
        if (_PersonCircle != null) {
            return _PersonCircle!!
        }
        _PersonCircle = ImageVector.Builder(
            name = "PersonCircle",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8f)
                moveToRelative(8f, -7f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.468f, 11.37f)
                curveTo(3.242f, 11.226f, 4.805f, 10f, 8f, 10f)
                reflectiveCurveToRelative(4.757f, 1.225f, 5.468f, 2.37f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 1f)
            }
        }.build()
        return _PersonCircle!!
    }

private var _PersonCircle: ImageVector? = null

public val Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                close()
            }
        }.build()
        return _Logout!!
    }

private var _Logout: ImageVector? = null


public val StarFull: ImageVector
    get() {
        if (_StarFull != null) {
            return _StarFull!!
        }
        _StarFull = ImageVector.Builder(
            name = "StarFull",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.595f, 6.252f)
                lineTo(8f, 1f)
                lineTo(6.405f, 6.252f)
                horizontalLineTo(1f)
                lineToRelative(4.373f, 3.4f)
                lineTo(3.75f, 15f)
                lineTo(8f, 11.695f)
                lineTo(12.25f, 15f)
                lineToRelative(-1.623f, -5.348f)
                lineTo(15f, 6.252f)
                horizontalLineTo(9.595f)
                close()
            }
        }.build()
        return _StarFull!!
    }

private var _StarFull: ImageVector? = null

