package com.news.news_presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.news.common_utils.Resource
import com.news.news_domain.use_case.GetNewsArticleUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class NewsViewModel @Inject constructor(private val getNewsArticleUseCase: GetNewsArticleUseCase):ViewModel() {

    private val _newsArticle = MutableStateFlow(NewsState())
    val newsArticle : StateFlow<NewsState> =_newsArticle

    init {
        getNewsArticle()
    }


    fun getNewsArticle(){
        getNewsArticleUseCase().onEach {
            when(it){
                is Resource.Loading ->{
                    _newsArticle.value = NewsState(isLoading = true)
                }
                is Resource.Error ->{
                    _newsArticle.value = NewsState(error = it.message)
                }
                is Resource.Success ->{
                    _newsArticle.value = NewsState(data = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }
}