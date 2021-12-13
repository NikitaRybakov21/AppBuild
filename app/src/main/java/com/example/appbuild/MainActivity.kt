package com.example.appbuild

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

     // binding.textView.text = BuildConfig.TYPE
        binding.textView.text = getString(R.string.hello)
    }
}