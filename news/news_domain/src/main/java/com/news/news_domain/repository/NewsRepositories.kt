package com.news.news_domain.repository

import com.news.news_domain.model.Article

interface NewsRepositories {
    suspend fun getArticle():List<Article>
}