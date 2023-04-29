package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeActivity3 : AppCompatActivity() {
    lateinit var button4:Button
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        button4=findViewById(R.id.button4)
        button=findViewById(R.id.button)
        button4.setOnClickListener {
            var forward =Intent(this,MemeActivity2::class.java)
            startActivity(forward)
        }
        button.setOnClickListener {
            var forward = Intent(this,MemeActivity4::class.java)
            startActivity(forward)
        }
    }
}