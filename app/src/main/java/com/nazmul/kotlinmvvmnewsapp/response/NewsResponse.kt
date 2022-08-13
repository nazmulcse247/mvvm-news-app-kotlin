package com.nazmul.kotlinmvvmnewsapp.response

data class NewsResponse(
    val status : String,
    val totalResults : Int,
    val articles : List<Articles>
)
