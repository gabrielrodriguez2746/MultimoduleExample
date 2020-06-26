package com.multimodule.network.models

class ServerLogsEnabled private constructor(private val enabled: Boolean) {
    operator fun invoke() = enabled

    companion object {
        fun Boolean.toServerLogsEnabled(): ServerLogsEnabled = ServerLogsEnabled(this)
    }
}