package com.multimodule.network.di.modules

import com.multimodule.network.models.BaseUrl
import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
object ClientModule {

    private const val READ_TIME_OUT = 5L
    private const val CONNECT_TIME_OUT = 5L

    @Provides
    @Reusable
    fun provideHttpClient(
        interceptors: @JvmSuppressWildcards Set<Interceptor>
    ): OkHttpClient {
        return OkHttpClient.Builder().apply {
            readTimeout(READ_TIME_OUT, TimeUnit.SECONDS)
            connectTimeout(CONNECT_TIME_OUT, TimeUnit.SECONDS)
            interceptors.forEach { interceptor ->
                addInterceptor(interceptor)
            }
        }.build()
    }

    @Provides
    @Reusable
    fun provideRetrofit(
        httpClient: OkHttpClient,
        baseUrl: BaseUrl
    ): Retrofit {
        return Retrofit.Builder()
            .client(httpClient)
            .baseUrl(baseUrl())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}