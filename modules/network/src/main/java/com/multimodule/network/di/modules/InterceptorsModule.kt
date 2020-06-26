package com.multimodule.network.di.modules

import com.multimodule.network.interceptors.HeadersInterceptor
import com.multimodule.network.interceptors.ServerLogsInterceptor
import dagger.Binds
import dagger.Module
import dagger.Reusable
import dagger.multibindings.IntoSet
import okhttp3.Interceptor

@Module
abstract class InterceptorsModule {

    @Binds
    @Reusable
    @IntoSet
    abstract fun bindServerLogsInterceptor(interceptor: ServerLogsInterceptor): Interceptor

    @Binds
    @Reusable
    @IntoSet
    abstract fun bindHeadersInterceptor(interceptor: HeadersInterceptor): Interceptor
}