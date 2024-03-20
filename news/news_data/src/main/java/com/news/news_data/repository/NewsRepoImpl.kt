package com.news.news_data.repository

import com.news.common_utils.Constants
import com.news.news_data.mapper.toDomainArticle
import com.news.news_data.network.NewsApiServices
import com.news.news_domain.model.Article
import com.news.news_domain.repository.NewsRepositories

class NewsRepoImpl(private val newsApiServices: NewsApiServices):NewsRepositories {
    override suspend fun getArticle(): List<Article> {
        return newsApiServices.getNewsArticle().articles.map{it.toDomainArticle()}
    }
}