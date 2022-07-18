package com.example.jetpackpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a : Button = findViewById(R.id.aButton)
        val b : Button = findViewById(R.id.bButton)

        a.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame, AFragment())
                .commit()
        }

        b.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame, BFragment())
                .commit()
        }
    }
}