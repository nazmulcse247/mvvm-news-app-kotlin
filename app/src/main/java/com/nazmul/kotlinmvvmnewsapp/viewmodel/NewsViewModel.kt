package com.nazmul.kotlinmvvmnewsapp.viewmodel

import androidx.lifecycle.ViewModel
import com.nazmul.kotlinmvvmnewsapp.repository.NewsRepository

class NewsViewModel(
    val repository: NewsRepository

) : ViewModel() {

}