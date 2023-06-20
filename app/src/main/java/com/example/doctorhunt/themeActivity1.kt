package com.example.doctorhunt

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class themeActivity1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theme1)
        val getStartbtn=findViewById<Button>(R.id.btns1)
        val skipOne=findViewById<TextView>(R.id.skipOne)
        getStartbtn.setOnClickListener {
            startActivity(Intent(this,themeActivity2::class.java))
        }
        skipOne.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }
    }
}