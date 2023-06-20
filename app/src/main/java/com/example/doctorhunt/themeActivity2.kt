package com.example.doctorhunt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class themeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theme2)
        val getStart=findViewById<Button>(R.id.btn2)
        val skipToo=findViewById<TextView>(R.id.skipToo)
        getStart.setOnClickListener {
            startActivity(Intent(this,themeActivity3::class.java))
        }
        skipToo.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }
    }
}