package br.com.resources.pieces

import kotlinx.coroutines.delay

suspend fun startDelay(time: Long, onEnd: () -> Unit = {}) {
    delay(timeMillis = time)
    onEnd()
}
