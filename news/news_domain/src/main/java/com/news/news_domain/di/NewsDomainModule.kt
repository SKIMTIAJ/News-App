package com.news.news_domain.di

import com.news.news_domain.repository.NewsRepositories
import com.news.news_domain.use_case.GetNewsArticleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class NewsDomainModule {

    @Provides
    fun provideGetNewsUseCase(newsRepositories: NewsRepositories):GetNewsArticleUseCase{
        return GetNewsArticleUseCase(newsRepositories)
    }

}