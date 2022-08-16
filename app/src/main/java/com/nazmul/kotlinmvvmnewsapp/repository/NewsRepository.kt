package com.nazmul.kotlinmvvmnewsapp.repository

import com.nazmul.kotlinmvvmnewsapp.api.RetrofitInstance
import com.nazmul.kotlinmvvmnewsapp.db.ArticleDatabase

class NewsRepository(
    val db : ArticleDatabase
) {

    suspend fun getBreakingNews(query : String , startDate : String , sortBy : String) =
        RetrofitInstance.api.getNewsApi(query, startDate, sortBy)

}