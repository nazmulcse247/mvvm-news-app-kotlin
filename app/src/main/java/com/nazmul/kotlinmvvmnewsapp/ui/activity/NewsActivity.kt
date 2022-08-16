package com.nazmul.kotlinmvvmnewsapp.ui.activity

import NewsViewModelProvider
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.nazmul.kotlinmvvmnewsapp.R
import com.nazmul.kotlinmvvmnewsapp.databinding.ActivityNewsBinding
import com.nazmul.kotlinmvvmnewsapp.db.ArticleDatabase
import com.nazmul.kotlinmvvmnewsapp.repository.NewsRepository
import com.nazmul.kotlinmvvmnewsapp.viewmodel.NewsViewModel

class NewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewsBinding
    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_news)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProvider(newsRepository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory).get(NewsViewModel::class.java)
        binding.bottomNavView.setupWithNavController(findNavController(R.id.fragmentContainerView))


    }
}