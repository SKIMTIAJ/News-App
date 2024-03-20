package com.news.application

import com.news.application.navigation.DefaultNevigation
import com.news.common_utils.Navigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object MainModule {

    @Singleton
    @Provides
    fun navigationProvider():Navigator.Provider{
        return DefaultNevigation()
    }

}