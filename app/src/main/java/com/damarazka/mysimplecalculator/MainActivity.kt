package com.damarazka.mysimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.damarazka.mysimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun onClearClick(view: View) {}
    fun onBackClick(view: View) {}
    fun onOperatorClick(view: View) {}
    fun onEqualClick(view: View) {}
    fun onAllClearClick(view: View) {}
    fun onDigitClick(view: View) {}
}