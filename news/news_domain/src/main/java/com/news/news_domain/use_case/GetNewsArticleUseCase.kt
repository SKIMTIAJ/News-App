package com.news.news_domain.use_case

import com.news.common_utils.Resource
import com.news.news_domain.model.Article
import com.news.news_domain.repository.NewsRepositories
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetNewsArticleUseCase(private val newsRepositories: NewsRepositories) {
    operator fun invoke():Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = newsRepositories.getArticle()))
        }catch (e:Exception){
            emit(Resource.Error(message = e.message.toString()))
        }
    }
}