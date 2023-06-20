package com.example.doctorhunt

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.app.AlertDialog
import android.content.DialogInterface
import android.widget.Button

class AppointmentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val appointmentView = inflater.inflate(R.layout.fragment_appointment, container, false)

        val appointmentBtns = appointmentView.findViewById<Button>(R.id.appointmentBtn)
        appointmentBtns.setOnClickListener {
            showAlert()
        }
            return  appointmentView
    }
    private fun showAlert() {
        val builder = AlertDialog.Builder(requireContext())

        // Set the alert dialog title
        builder.setTitle("Alert")

        // Set the alert dialog message
        builder.setMessage("The action can't be completed.")
        builder.setIcon(R.drawable.baseline_warning_24)

        // Set the positive button and its click listener
        builder.setPositiveButton("OK") { dialog, _ ->
            // Do something when the OK button is clicked
            dialog.dismiss()
        }

        // Set the negative button and its click listener
        builder.setNegativeButton("Cancel") { dialog, _ ->
            // Do something when the Cancel button is clicked
            dialog.dismiss()
        }

        // Create and show the alert dialog
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }


}