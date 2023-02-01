package com.geektech.hw_6_4

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.geektech.hw_6_4.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fAdapter by lazy {
        MainAdapter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        binding.vpCounter.adapter = fAdapter
    }
}