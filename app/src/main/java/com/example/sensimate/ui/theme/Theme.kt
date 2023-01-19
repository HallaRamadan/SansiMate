package com.example.sensimate.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    background = Dark,
    surface = Black2,
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200,
    secondaryVariant = OrangeLight,
    error = PurpleLight,
    onPrimary = White,
    onBackground = BlackDark,
    onSecondary = WhiteDark,
    onError = Gunmetal,




)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200,

    //-------- SensiMate app´s Color--- But not sure to use all of them -----//
    background = Color.White,
    surface = Color.LightGray,
    onPrimary = Color.Green,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,

)

@Composable
fun SensiMateTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        DarkColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}