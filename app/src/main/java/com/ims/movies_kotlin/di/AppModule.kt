package com.ims.movies_kotlin.di

import com.ims.movies_kotlin.utils.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun providesBaseUrl(): String{
        return BASE_URL

    }
}