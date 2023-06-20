package com.example.doctorhunt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class themeActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theme3)
        val startBtn=findViewById<Button>(R.id.btn3)
        val skipThree=findViewById<TextView>(R.id.skipThree)
        startBtn.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }
        skipThree.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }
    }
}