package com.multimodule.network.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class HeadersInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()
        requestBuilder
            .header(
                "Accept",
                "application/json"
            )
            .header(
                "Content-Type",
                "application/json"
            )
            .method(chain.request().method(), chain.request().body())
        return chain.proceed(requestBuilder.build())
    }
}
