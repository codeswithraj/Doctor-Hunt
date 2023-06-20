package com.example.doctorhunt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class DoctorDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_details)
        val Dialog= AlertDialog.Builder(this)
//        Dialog.setTitle("Remove user")
//        Dialog.setMessage("Are you sure you want to remove user?")
//        Dialog.setIcon(R.drawable.baseline_warning_amber_24)
        Dialog.setView(R.layout.alert)
        Dialog.setPositiveButton("Ok"){
                dialog,which->startActivity(Intent(this,loginActivity::class.java))
        }
        Dialog.setNegativeButton("Cancel"){
                dialog,which->startActivity(Intent(this,loginActivity::class.java))
        }
        Dialog.create()
        Dialog.show()
    }
}