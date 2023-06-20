package com.example.doctorhunt

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView

class HomeFragment : Fragment() {
    // declaring a null variable for VideoView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rowView= inflater.inflate(R.layout.fragment_home, container, false)
        val sharedPreferences = activity?.getSharedPreferences("userPref", Context.MODE_PRIVATE)
        val name = rowView.findViewById<TextView>(R.id.nameView)
        name.text = sharedPreferences?.getString("name", "").toString()
        return rowView
    }

}
