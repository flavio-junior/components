package br.com.components.typography

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import br.com.components.R
import br.com.components.pieces.FontSize

private val fontSize = FontSize

data class Typography(val textAlign: TextAlign? = null) {

    val title: TextStyle = TextStyle(
        color = Color.Black,
        fontSize = fontSize.fontSize32,
        fontWeight = FontWeight.SemiBold,
        textAlign = textAlign ?: TextAlign.Start,
        lineHeight = TextUnit.Unspecified,
        fontFamily = FontFamily(Font(R.font.onest_bold)),
        textDecoration = TextDecoration.None,
        fontStyle = FontStyle.Normal,
        letterSpacing = TextUnit.Unspecified
    )

    val subTitle: TextStyle = TextStyle(
        color = Color.Black,
        fontSize = fontSize.fontSize24,
        fontWeight = FontWeight.Medium,
        textAlign = textAlign ?: TextAlign.Start,
        lineHeight = TextUnit.Unspecified,
        fontFamily = FontFamily(Font(R.font.onest_medium)),
        textDecoration = TextDecoration.None,
        fontStyle = FontStyle.Normal,
        letterSpacing = TextUnit.Unspecified
    )

    val description: TextStyle = TextStyle(
        color = Color.Black,
        fontSize = fontSize.fontSize20,
        fontWeight = FontWeight.Bold,
        textAlign = textAlign ?: TextAlign.Start,
        lineHeight = TextUnit.Unspecified,
        fontFamily = FontFamily(Font(R.font.onest_regular)),
        textDecoration = TextDecoration.None,
        fontStyle = FontStyle.Normal,
        letterSpacing = TextUnit.Unspecified
    )

    val simpleText: TextStyle = TextStyle(
        color = Color.Black,
        fontSize = fontSize.fontSize16,
        fontWeight = FontWeight.Bold,
        textAlign = textAlign ?: TextAlign.Start,
        lineHeight = TextUnit.Unspecified,
        fontFamily = FontFamily(Font(R.font.onest_regular)),
        textDecoration = TextDecoration.None,
        fontStyle = FontStyle.Normal,
        letterSpacing = TextUnit.Unspecified
    )
}

val LocalTypography = staticCompositionLocalOf {
    Typography()
}
