package com.multimodule.network.models

class BaseUrl private constructor(private val url: String) {
    operator fun invoke() = url

    companion object {
        fun String.toBaseUrl(): BaseUrl =
            BaseUrl(this)
    }
}