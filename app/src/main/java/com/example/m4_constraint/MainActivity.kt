package com.example.m4_constraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.image)
        val back = findViewById<ImageButton>(R.id.back)
        val play = findViewById<ImageButton>(R.id.play)
        val forward = findViewById<ImageButton>(R.id.forward)
         val text1 = findViewById<TextView>(R.id.text1)
        val text2 = findViewById<TextView>(R.id.text2)

        back.setOnClickListener{}
        play.setOnClickListener{}
        forward.setOnClickListener{}

    }
}