package com.example.doctorhunt

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import kotlin.math.sign

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val email=findViewById<TextInputEditText>(R.id.email)
        val pass=findViewById<TextInputEditText>(R.id.password)
        val signupBtn=findViewById<TextView>(R.id.signUpPage)
        val loginButton=findViewById<Button>(R.id.loginBtn)
        signupBtn.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }
        val registerSharedPreferences = getSharedPreferences("userPref", Context.MODE_PRIVATE)
        val userName=registerSharedPreferences.getString("email","")
        val userPass=registerSharedPreferences.getString("password","")
        loginButton.setOnClickListener {
            val user: String = email.text.toString()
            val pass: String = pass.text.toString()
            if (userName==user && userPass==pass) {
                val edit = registerSharedPreferences.edit()
                edit.putBoolean("userLogin", true)
                edit.apply()
                val intent = Intent(this,homepageActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(getApplicationContext(), "Email/Password Invalid", Toast.LENGTH_LONG).show();
            }
        }
    }
}