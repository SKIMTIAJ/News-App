package com.news.common_utils.network

import com.news.common_utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object CommonModule {

    @Singleton
    @Provides
    fun provideRetofit():Retrofit{
        return Retrofit.Builder().baseUrl(Constants.BASEURL)
            .addConverterFactory(GsonConverterFactory.create()).build();
    }
}