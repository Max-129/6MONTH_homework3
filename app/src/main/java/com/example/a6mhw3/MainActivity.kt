package com.example.a6mhw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a6mhw3.adapter.ViewPagerAdapter
import com.example.a6mhw3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ViewPagerAdapter(this)
        binding.viewPager2.adapter = adapter
    }
}
