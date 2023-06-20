package com.example.doctorhunt

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class ProfileFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rowView= inflater.inflate(R.layout.fragment_profile, container, false)
        val sharedPreferences = activity?.getSharedPreferences("userPref", Context.MODE_PRIVATE)
        val name = rowView.findViewById<TextView>(R.id.Text_name)
        val mobile= rowView.findViewById<TextView>(R.id.Text_mobile)
        val mail = rowView.findViewById<TextView>(R.id.Text_mail)
        val pass = rowView.findViewById<TextView>(R.id.Text_pass)
        name.text = sharedPreferences?.getString("name", "").toString()
        mobile.text = sharedPreferences?.getString("number", "").toString()
        mail.text = sharedPreferences?.getString("email", "").toString()
        pass.text = sharedPreferences?.getString("password", "").toString()

        return rowView
    }

}