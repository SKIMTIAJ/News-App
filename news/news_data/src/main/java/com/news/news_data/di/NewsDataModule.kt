package com.news.news_data.di

import com.news.news_data.network.NewsApiServices
import com.news.news_data.repository.NewsRepoImpl
import com.news.news_domain.repository.NewsRepositories
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NewsDataModule {

    @Provides
    fun provideNewApiServices(retrofit: Retrofit):NewsApiServices{
        return retrofit.create(NewsApiServices::class.java)
    }

    @Provides
    fun providesNewsRepositories(newsApiServices: NewsApiServices):NewsRepositories{
        return NewsRepoImpl(newsApiServices)
    }
}