package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeActivity2 : AppCompatActivity() {
    lateinit var button5:Button
    lateinit var button3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        button5=findViewById(R.id.button5)
        button3=findViewById(R.id.button3)
        button5.setOnClickListener {
            var forward =Intent(this,MainActivity::class.java)
            startActivity(forward)
        }
        button3.setOnClickListener {
            var forward = Intent(this,MemeActivity3::class.java)
        startActivity(forward)}
    }
}