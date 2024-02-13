package br.com.resources.utils

import kotlinx.coroutines.delay

suspend fun initDelay(time: Long, onEnd: () -> Unit = {}) {
    delay(timeMillis = time)
    onEnd()
}
