package com.nazmul.kotlinmvvmnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.nazmul.kotlinmvvmnewsapp.api.RetrofitInstance
import com.nazmul.kotlinmvvmnewsapp.databinding.ActivityNewsBinding
import kotlinx.android.synthetic.main.activity_news.*
import kotlinx.coroutines.GlobalScope

class NewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_news)

        binding.bottomNavView.setupWithNavController(findNavController(R.id.fragmentContainerView))


    }
}