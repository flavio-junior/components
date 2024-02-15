package br.com.components.pieces

import kotlinx.coroutines.delay

suspend fun startDelay(time: Long, onEnd: () -> Unit = {}) {
    delay(timeMillis = time)
    onEnd()
}
