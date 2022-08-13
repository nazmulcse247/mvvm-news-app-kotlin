package com.nazmul.kotlinmvvmnewsapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.nazmul.kotlinmvvmnewsapp.model.Articles

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(articles: Articles) : Long

    @Query("SELECT * FROM articles")
    fun getAllArticle() : LiveData<List<Articles>>

    @Delete()
    suspend fun deleteArticle(articles: Articles)

}