package com.example.myintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultBtn : Button = findViewById(R.id.result_btn)
        val resultTv : TextView = findViewById(R.id.result_tv)

        val resultText = intent.getStringExtra("result")

        resultTv.text = resultText

        resultBtn.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}