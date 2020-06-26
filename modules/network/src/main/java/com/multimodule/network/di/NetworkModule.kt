package com.multimodule.network.di

import com.multimodule.network.di.modules.ClientModule
import com.multimodule.network.di.modules.InterceptorsModule
import dagger.Module

@Module(includes = [ClientModule::class, InterceptorsModule::class])
object NetworkModule