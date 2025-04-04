package br.com.components.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import br.com.components.color.Colors
import br.com.components.color.DarkColor
import br.com.components.color.LightColor
import br.com.components.color.LocalColors
import br.com.components.pieces.LocalSpaces
import br.com.components.pieces.SpaceSize
import br.com.components.theme.Themes.size
import br.com.components.theme.Themes.typography
import br.com.components.typography.LocalTypography
import br.com.components.typography.Typography
import br.com.components.ui.ProvideTextStyleDefault

@Composable
fun Theme(
    content: @Composable () -> Unit
) {
    val isDarkTheme = isSystemInDarkTheme()
    val colors = if (isDarkTheme) DarkColor else LightColor

    val rememberedColorScheme = remember {
        colors.copy()
    }.apply {
        updateColorsFrom(colors)
    }

    CompositionLocalProvider(
        LocalColors provides rememberedColorScheme,
        LocalSpaces provides size,
        LocalTypography provides typography
    ) {
        ProvideTextStyleDefault(value = Typography().description, content)
    }
}

object Themes {
    val colors: Colors
        @Composable @ReadOnlyComposable
        get() = LocalColors.current
    val typography: Typography
        @Composable @ReadOnlyComposable
        get() = LocalTypography.current
    val size: SpaceSize
        @Composable @ReadOnlyComposable
        get() = LocalSpaces.current
}
