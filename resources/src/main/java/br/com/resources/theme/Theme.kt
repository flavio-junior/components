package br.com.resources.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import br.com.resources.color.Color
import br.com.resources.color.LocalColors
import br.com.resources.pieces.LocalSpaces
import br.com.resources.pieces.SpaceSize
import br.com.resources.theme.DefaultThemes.size
import br.com.resources.theme.DefaultThemes.typography
import br.com.resources.typography.LocalTypography
import br.com.resources.typography.Typography
import br.com.resources.ui.ProvideTextStyleDefault

@Composable
fun Theme(
    content: @Composable () -> Unit
) {
    val color: Color = DefaultThemes.color
    val rememberedColorScheme = remember {
        color.copy()
    }.apply {
        updateColorsFrom(color)
    }
    CompositionLocalProvider {
        LocalColors provides rememberedColorScheme
        LocalSpaces provides size
        LocalTypography provides typography
    }.apply {
        ProvideTextStyleDefault(value = Typography().description, content)
    }
}

object DefaultThemes {
    val color: Color
        @Composable @ReadOnlyComposable
        get() = LocalColors.current
    val typography: Typography
        @Composable @ReadOnlyComposable
        get() = LocalTypography.current
    val size: SpaceSize
        @Composable @ReadOnlyComposable
        get() = LocalSpaces.current
}
