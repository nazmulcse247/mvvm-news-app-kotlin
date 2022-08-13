package com.nazmul.kotlinmvvmnewsapp.response

import com.nazmul.kotlinmvvmnewsapp.model.Articles

data class NewsResponse(
    val status : String,
    val totalResults : Int,
    val articles : List<Articles>
)
