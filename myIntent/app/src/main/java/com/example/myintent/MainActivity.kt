package com.example.myintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentBtn : Button = findViewById(R.id.intent_btn)
        val textEdt : EditText = findViewById(R.id.text_edt)

        intentBtn.setOnClickListener {

            val resultText = textEdt.text.toString()

            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra("result", resultText)

            startActivity(intent)
        }
    }
}