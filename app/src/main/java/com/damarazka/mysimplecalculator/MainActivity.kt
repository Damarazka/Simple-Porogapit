package com.damarazka.mysimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClearClick(view: View) {}
    fun onBackClick(view: View) {}
    fun onOperatorClick(view: View) {}
    fun onEqualClick(view: View) {}
    fun onAllClearClick(view: View) {}
    fun onDigitClick(view: View) {}
}