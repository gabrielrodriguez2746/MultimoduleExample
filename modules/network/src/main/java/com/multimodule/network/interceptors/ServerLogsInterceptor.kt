package com.multimodule.network.interceptors

import com.multimodule.network.models.ServerLogsEnabled
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Inject

class ServerLogsInterceptor @Inject constructor(
    private val serverLogsEnabled: ServerLogsEnabled
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return HttpLoggingInterceptor(ServerLogger())
            .apply { level = serverLogsEnabled.toLoggingInterceptorLevel() }
            .intercept(chain)
    }
}

private class ServerLogger : HttpLoggingInterceptor.Logger {
    override fun log(message: String) {
        println("${ServerLogger::class.simpleName} :: $message")
    }
}

private fun ServerLogsEnabled.toLoggingInterceptorLevel(): HttpLoggingInterceptor.Level {
    return if (invoke()) {
        HttpLoggingInterceptor.Level.BODY
    } else {
        HttpLoggingInterceptor.Level.NONE
    }
}
