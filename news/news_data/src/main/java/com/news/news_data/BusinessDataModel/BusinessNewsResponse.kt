package com.news.news_data.BusinessDataModel

data class BusinessNewsResponse(
    val articles: List<ArticleDTO>,
    val status: String,
    val totalResults: Int
)