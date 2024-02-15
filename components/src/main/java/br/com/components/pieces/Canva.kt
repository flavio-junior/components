package br.com.components.pieces

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.onClickable(onClick: () -> Unit): Modifier {
    return Modifier.clickable(
        interactionSource = MutableInteractionSource(),
        indication = null,
        enabled = true,
        onClick = onClick,
        role = Role.Button
    )
}

fun Modifier.onSelectable(
    selected: Boolean,
    enabled: Boolean = true,
    onClick: () -> Unit
) = composed {
    Modifier.selectable(
        selected = selected,
        enabled = enabled,
        role = Role.RadioButton,
        interactionSource = remember { MutableInteractionSource() },
        indication = null,
        onClick = onClick
    )
}

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.onBorder(onClick: () -> Unit = {}, spaceSize: Dp, width: Dp, color: Color): Modifier {
    return Modifier
        .border(width, color, RoundedCornerShape(corner = CornerSize(spaceSize)))
        .clickable(
            interactionSource = MutableInteractionSource(),
            indication = null,
            enabled = true,
            onClick = onClick,
            role = Role.Button
        )
        .clip(shape = RoundedCornerShape(corner = CornerSize(spaceSize)))
}

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.onCircle(
    color: Color = Color.Black,
    shape: Shape = CircleShape,
    width: Dp = SpaceSize.spaceSize2
): Modifier {
    return Modifier
        .border(
            BorderStroke(width = width, color = color),
            shape
        )
        .clip(shape = shape)
}

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.onBorderDefault(
    color: Color = Color.Black,
    onClick: () -> Unit = {},
    spaceSize: Dp = SpaceSize.spaceSize10,
    width: Dp = SpaceSize.spaceSize2
): Modifier {
    return Modifier
        .border(width, color, RoundedCornerShape(corner = CornerSize(spaceSize)))
        .clickable(
            interactionSource = MutableInteractionSource(),
            indication = null,
            enabled = true,
            onClick = onClick,
            role = Role.Button
        )
        .clip(shape = RoundedCornerShape(corner = CornerSize(spaceSize)))
}
