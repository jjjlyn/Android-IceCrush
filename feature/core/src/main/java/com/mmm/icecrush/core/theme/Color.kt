package com.mmm.icecrush.core.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val blue = Color(0xFF5D7CFC)
val red = Color(0xFFFF76666)
val yellow = Color(0xFFFED95E)
val pink = Color(0xFFFFB7E3)
val green = Color(0xFF2EDA87)
val black = Color(0xFF000000)
val white = Color(0xFFFFFFFF)

internal val LocalFilterMuskColor = staticCompositionLocalOf<Color> {
    error("No Musk Color Provided")
}