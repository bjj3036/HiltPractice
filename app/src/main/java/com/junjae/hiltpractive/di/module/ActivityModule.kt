package com.junjae.hiltpractive.di.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {
    @Provides
    fun provideString(): String = "Hello, Junjae"
}