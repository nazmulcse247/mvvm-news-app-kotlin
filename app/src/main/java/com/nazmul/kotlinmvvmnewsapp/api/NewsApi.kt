package com.nazmul.kotlinmvvmnewsapp.api

import com.nazmul.kotlinmvvmnewsapp.constant.AppConstant.API_KEY
import com.nazmul.kotlinmvvmnewsapp.response.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("everything")
    suspend fun getNewsApi(
        @Query("q") title : String,
        @Query("from") startDate : String,
        @Query("sortBy") sortBy : String,
        @Query("apiKey") apiKey : String = API_KEY

    ) : Response<NewsResponse>
}