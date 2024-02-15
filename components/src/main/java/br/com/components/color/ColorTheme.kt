package br.com.components.color

import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt
import br.com.components.pieces.ColorsUtils.IS_LIGHT
import br.com.components.pieces.ColorsUtils.LIGHT_BACKGROUND
import br.com.components.pieces.ColorsUtils.LIGHT_ERROR
import br.com.components.pieces.ColorsUtils.LIGHT_PRIMARY
import br.com.components.pieces.ColorsUtils.LIGHT_SUCCESS
import br.com.components.pieces.ColorsUtils.LIGHT_TEXT

object ColorTheme {

    fun lightColor() = Color(
        primary = Color(LIGHT_PRIMARY.toColorInt()),
        text = Color(LIGHT_TEXT.toColorInt()),
        background = Color(LIGHT_BACKGROUND.toColorInt()),
        success = Color(LIGHT_SUCCESS.toColorInt()),
        error = Color(LIGHT_ERROR.toColorInt()),
        isLight = IS_LIGHT
    )
}
