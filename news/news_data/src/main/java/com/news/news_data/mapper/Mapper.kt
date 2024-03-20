package com.news.news_data.mapper

import com.news.news_data.BusinessDataModel.ArticleDTO
import com.news.news_domain.model.Article

fun ArticleDTO.toDomainArticle():Article{
    return Article(
        author = this.author,
        content = this.content,
        description = this.description,
        title = this.title,
        urlToImage = this.urlToImage
    )
}