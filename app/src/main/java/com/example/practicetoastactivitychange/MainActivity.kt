package com.example.practicetoastactivitychange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttToast = findViewById<Button>(R.id.butt_toast)
        val buttCount = findViewById<Button>(R.id.butt_count)
        val buttRandom = findViewById<Button>(R.id.butt_random)
        val txvCnt = findViewById<TextView>(R.id.txv_count)


        buttToast.setOnClickListener {
            Toast.makeText(applicationContext, "Toast", Toast.LENGTH_SHORT).show()
        }
        var numCnt = 0
        buttCount.setOnClickListener {
            numCnt++
            txvCnt.text = numCnt.toString()
        }
        val intent = Intent(this, RandomActivity::class.java)

        buttRandom.setOnClickListener {
            if (numCnt == 0){ //@Random, from 0 until 0면 에러 발생
                Toast.makeText(applicationContext, "Counter is Zero.", Toast.LENGTH_SHORT).show()
            }
            else {
                intent.putExtra("numCnt", numCnt)
                startActivity(intent)
            }
        }
    }
}