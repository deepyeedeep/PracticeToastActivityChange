package com.example.practicetoastactivitychange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RandomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        val txvRandNum = findViewById<TextView>(R.id.txv_randnum)
    }
}