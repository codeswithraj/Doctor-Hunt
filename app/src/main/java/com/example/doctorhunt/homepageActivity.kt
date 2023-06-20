package com.example.doctorhunt

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class homepageActivity : AppCompatActivity() {

    lateinit var bottomNav :BottomNavigationView

//    var simpleVideoView: VideoView? = null
//    var simpleVideo: VideoView? = null
//    var simpleVideo1: VideoView? = null
//    var simpleVideo2: VideoView? = null
//    declaring a null variable for MediaController
//    var mediaControls: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val logoutBtn=findViewById<Button>(R.id.logoutBtn)
        logoutBtn.setOnClickListener {
            val Dialog= AlertDialog.Builder(this)
            Dialog.setTitle("Log Out")
            Dialog.setMessage("Are you sure you want to logout?")
            Dialog.setPositiveButton("Ok"){
                    dialog,which->startActivity(Intent(this,themeActivity1::class.java))
            }
            Dialog.setNegativeButton("Cancel"){
                    dialog,which->
            }
            val sharedPreferences = getSharedPreferences("userPref", Context.MODE_PRIVATE)
            val editUserPref = sharedPreferences.edit()
            editUserPref.putBoolean("userLogin",false)
            editUserPref.apply()
//            startActivity(Intent(this,loginActivity::class.java))
            Dialog.create()
            Dialog.show()
        }
        loadFragment(HomeFragment())
        bottomNav = findViewById(R.id.bottomNav)


        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    loadFragment(HomeFragment())
                }
                R.id.favourite -> {
                    loadFragment(FavouriteFragment())
                }
                R.id.appointment -> {
                    loadFragment(AppointmentFragment())
                }
                R.id.message -> {
                    loadFragment(MessageFragment())
                }
                R.id.profile -> {
                    loadFragment(ProfileFragment())
                }
            }
            true
        }
//        simpleVideoView = findViewById<View>(R.id.simpleVideoView) as VideoView
//        simpleVideo1 = findViewById<View>(R.id.simpleVideo1) as VideoView
//        simpleVideo = findViewById<View>(R.id.simpleVideo) as VideoView
//        simpleVideo2 = findViewById<View>(R.id.simpleVideo2) as VideoView
//
//        if (mediaControls == null) {
//            // creating an object of media controller class
//            mediaControls = MediaController(this)
//
//            // set the anchor view for the video view
//            mediaControls!!.setAnchorView(this.simpleVideoView)
//        }
//
//        // set the media controller for video view
//        simpleVideoView!!.setMediaController(mediaControls)
//
//        // set the absolute path of the video file which is going to be played
//        simpleVideoView!!.setVideoURI(
//            Uri.parse("android.resource://"
//                    + packageName + "/" + R.raw.videos))
//
//        simpleVideoView!!.requestFocus()
//
//        // starting the video
//        simpleVideoView!!.start()
//
//        // display a toast message
//        // after the video is completed
//        simpleVideoView!!.setOnCompletionListener {
//            Toast.makeText(applicationContext, "Video completed",
//                Toast.LENGTH_LONG).show()
//            true
//        }
//
//        // display a toast message if any
//        // error occurs while playing the video
//        simpleVideoView!!.setOnErrorListener { mp, what, extra ->
//            Toast.makeText(applicationContext, "An Error Occurred " +
//                    "While Playing Video !!!", Toast.LENGTH_LONG).show()
//            false
//        }
//
//        if (mediaControls == null) {
//            // creating an object of media controller class
//            mediaControls = MediaController(this)
//
//            // set the anchor view for the video view
//            mediaControls!!.setAnchorView(this.simpleVideo)
//        }
//
//        // set the media controller for video view
//        simpleVideo!!.setMediaController(mediaControls)
//
//        // set the absolute path of the video file which is going to be played
//        simpleVideo!!.setVideoURI(
//            Uri.parse("android.resource://"
//                    + packageName + "/" + R.raw.videos))
//
//        simpleVideo!!.requestFocus()
//
//        // starting the video
//        simpleVideo!!.start()
//
//        // display a toast message
//        // after the video is completed
//        simpleVideo!!.setOnCompletionListener {
//            Toast.makeText(applicationContext, "Video completed",
//                Toast.LENGTH_LONG).show()
//            true
//        }
//
//        // display a toast message if any
//        // error occurs while playing the video
//        simpleVideo!!.setOnErrorListener { mp, what, extra ->
//            Toast.makeText(applicationContext, "An Error Occurred " +
//                    "While Playing Video !!!", Toast.LENGTH_LONG).show()
//            false
//        }
//
//
//        if (mediaControls == null) {
//            // creating an object of media controller class
//            mediaControls = MediaController(this)
//
//            // set the anchor view for the video view
//            mediaControls!!.setAnchorView(this.simpleVideo1)
//        }
//
//        // set the media controller for video view
//        simpleVideo1!!.setMediaController(mediaControls)
//
//        // set the absolute path of the video file which is going to be played
//        simpleVideo1!!.setVideoURI(
//            Uri.parse("android.resource://"
//                    + packageName + "/" + R.raw.videos))
//
//        simpleVideo1!!.requestFocus()
//
//        // starting the video
//        simpleVideo1!!.start()
//
//        // display a toast message
//        // after the video is completed
//        simpleVideo1!!.setOnCompletionListener {
//            Toast.makeText(applicationContext, "Video completed",
//                Toast.LENGTH_LONG).show()
//            true
//        }
//
//        // display a toast message if any
//        // error occurs while playing the video
//        simpleVideo1!!.setOnErrorListener { mp, what, extra ->
//            Toast.makeText(applicationContext, "An Error Occurred " +
//                    "While Playing Video !!!", Toast.LENGTH_LONG).show()
//            false
//        }
//        if (mediaControls == null) {
//            // creating an object of media controller class
//            mediaControls = MediaController(this)
//
//            // set the anchor view for the video view
//            mediaControls!!.setAnchorView(this.simpleVideo2)
//        }
//
//        // set the media controller for video view
//        simpleVideo2!!.setMediaController(mediaControls)
//
//        // set the absolute path of the video file which is going to be played
//        simpleVideo2!!.setVideoURI(
//            Uri.parse("android.resource://"
//                    + packageName + "/" + R.raw.videos))
//
//        simpleVideo2!!.requestFocus()
//
//        // starting the video
//        simpleVideo2!!.start()
//
//        // display a toast message
//        // after the video is completed
//        simpleVideo2!!.setOnCompletionListener {
//            Toast.makeText(applicationContext, "Video completed",
//                Toast.LENGTH_LONG).show()
//            true
//        }
//
//        // display a toast message if any
//        // error occurs while playing the video
//        simpleVideo2!!.setOnErrorListener { mp, what, extra ->
//            Toast.makeText(applicationContext, "An Error Occurred " +
//                    "While Playing Video !!!", Toast.LENGTH_LONG).show()
//            false
//        }
    }
    private fun loadFragment (fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame,fragment).commit()
    }
    }