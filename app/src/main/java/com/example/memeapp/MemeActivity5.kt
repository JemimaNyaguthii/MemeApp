package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeActivity5 : AppCompatActivity() {
    lateinit var button8: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        button8=findViewById(R.id.button8)
        button8.setOnClickListener {
            val forward = Intent(this,MemeActivity4::class.java)
            startActivity(forward)

        }
    }
    }
