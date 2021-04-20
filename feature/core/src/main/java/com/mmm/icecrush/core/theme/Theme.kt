package com.mmm.icecrush.core.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

private val ColorPalette = lightColors(
    primary = blue,
    onPrimary = black,
    secondary = red,
    onSecondary = white,
    background = blue,
    onSurface = black
)

@Composable
fun IceCrushAppTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colors = ColorPalette,
        typography = typography,
        content = content
    )
}
