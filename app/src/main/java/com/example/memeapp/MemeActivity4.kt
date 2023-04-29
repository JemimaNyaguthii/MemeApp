package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MemeActivity4 : AppCompatActivity() {
    lateinit var button7: Button
    lateinit var button6: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        button7=findViewById(R.id.button7)
        button6=findViewById(R.id.button6)
        button7.setOnClickListener {
            var forward =Intent(this,MemeActivity3::class.java)
            startActivity(forward)
        }
        button6.setOnClickListener {
            var forward = Intent(this,MemeActivity5::class.java)
            startActivity(forward)
        }

    }
}
