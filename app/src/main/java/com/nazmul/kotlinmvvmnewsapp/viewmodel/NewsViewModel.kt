package com.nazmul.kotlinmvvmnewsapp.viewmodel

import android.content.res.Resources
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nazmul.kotlinmvvmnewsapp.constant.Resource
import com.nazmul.kotlinmvvmnewsapp.repository.NewsRepository
import com.nazmul.kotlinmvvmnewsapp.response.NewsResponse
import kotlinx.coroutines.launch
import retrofit2.Response

class NewsViewModel(
    val repository: NewsRepository

) : ViewModel() {

    init {
        getBreakingNews("tesla","2022-07-16","publishedAt")
    }

    val breakingNews : MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
    var breakingNewsPage = 1


    fun getBreakingNews(query : String , startDate : String , sortBy : String) = viewModelScope.launch {
        breakingNews.postValue(Resource.Loading())
        val response = repository.getBreakingNews(query,startDate,sortBy)
        breakingNews.postValue(handleBreakingNewsResonse(response))
    }

    fun handleBreakingNewsResonse(response: Response<NewsResponse>) : Resource<NewsResponse>{
        if (response.isSuccessful){
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }



}