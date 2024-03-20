package com.news.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.news.application.databinding.ActivityMainBinding
import com.news.common_utils.Activities
import com.news.common_utils.Navigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var provider:Navigator.Provider

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
        get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        provider.getActivity(Activities.NewsActivity).navigate(this)
    }
}