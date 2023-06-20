package com.example.doctorhunt

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({ val intent = Intent(this,themeActivity1::class.java)
            startActivity(intent)
            val sharedPreferences = getSharedPreferences("userPref", Context.MODE_PRIVATE)
            val loginStatus =sharedPreferences.getBoolean("userLogin",false)
            if(loginStatus){
                startActivity(Intent(this,homepageActivity::class.java))
            }
            else{
                startActivity(Intent(this,themeActivity1::class.java))
            }
        },1000)
    }
}