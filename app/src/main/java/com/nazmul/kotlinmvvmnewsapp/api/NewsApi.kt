package com.nazmul.kotlinmvvmnewsapp.api

import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("everything")
    suspend fun getNewsApi(
        @Query("q") title : String,
        @Query("from") startDate : String,
        @Query("sortBy") sortBy : String

    )
}