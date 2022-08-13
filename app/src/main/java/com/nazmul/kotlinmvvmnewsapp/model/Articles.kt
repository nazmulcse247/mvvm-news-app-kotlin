package com.nazmul.kotlinmvvmnewsapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "articles")
data class Articles(
    @PrimaryKey(autoGenerate = true)
    val id : Int? = null,
    val source : Source,
    val author : String,
    val title : String,
    val description : String,
    val url : String,
    val urlToImage : String,
    val publishedAt : String,
    val content : String,

    )
