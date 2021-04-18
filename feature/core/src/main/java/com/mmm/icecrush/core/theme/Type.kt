package com.mmm.icecrush.core.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mmm.icecrush.core.R

private val MontserratFontFamily = FontFamily(
    Font(R.font.montserrat_black, FontWeight.Black)
)

private val GmarketSansFontFamily = FontFamily(
    Font(R.font.gmarketsans_medium, FontWeight.Medium)
)

val typography = Typography(
    defaultFontFamily = GmarketSansFontFamily,
    // Title Main
    h1 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontSize = 44.sp
    ),
    // Title Nav
    h2 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontSize = 16.sp
    ),
    // Body Large
    body1 = TextStyle(
        fontSize = 28.sp
    ),
    // Body Medium
    body2 = TextStyle(
        fontSize = 20.sp
    ),
    // Body Small
    caption = TextStyle(
        fontSize = 14.sp
    )
)