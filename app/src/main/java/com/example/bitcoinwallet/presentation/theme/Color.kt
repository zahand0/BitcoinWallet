package com.example.bitcoinwallet.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val LightCream100 = Color(0xfff9f9f7)
val LightCream200 = Color(0xfff5f4ed)
val LightCream300 = Color(0xffefeee8)
val LightCream400 = Color(0xffeae8e0)

val DarkGrey = Color(0xFF121212)
//val DarkGrey = Color(0xFF1F1F1F)
val DarkGreyLighter = Color(0xFF2A2A2A)

val Purple200Dark = Color(0xFF855fb5)
val Purple500Dark = Color(0xFF4900ba)

val Colors.shimmerOnPrimary
    @Composable
    get() = if (isSystemInDarkTheme()) Purple200Dark else Purple500Dark