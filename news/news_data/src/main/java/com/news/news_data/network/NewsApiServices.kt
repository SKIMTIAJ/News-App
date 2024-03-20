package com.news.news_data.network

import com.news.common_utils.Constants
import com.news.news_data.BusinessDataModel.BusinessNewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiServices {

    // https://newsapi.org/v2/everything?q=tesla&from=2024-02-03&sortBy=publishedAt&apiKey=8b8b13bb3da74384a40193c59ee24147
    // https://newsapi.org/v2/everything?domains=wsj.com&apiKey=8b8b13bb3da74384a40193c59ee24147
    // https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=8b8b13bb3da74384a40193c59ee24147

    @GET("top-headlines")
    suspend fun getNewsArticle(
        @Query("country") country:String = Constants.COUNTRY,
        @Query("category") category: String = Constants.CATEGORI,
        @Query("apiKey") apiKey:String = Constants.API_KEY
    ):BusinessNewsResponse
}