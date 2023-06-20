package com.example.doctorhunt

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FavouriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rowView= inflater.inflate(R.layout.fragment_favourite, container, false)
        val data= arrayListOf<DataModel>(
           DataModel("Dr. Abhinav Anand","Dentist","https://media.istockphoto.com/id/177373093/photo/indian-male-doctor.jpg?s=612x612&w=0&k=20&c=5FkfKdCYERkAg65cQtdqeO_D0JMv6vrEdPw3mX1Lkfg=","2.5years experiences")
           ,DataModel("Dr Neha Verma","Psychiatrist","https://health.gov/sites/default/files/styles/600_wide/public/2022-06/cadqt.jpg?itok=zn27s5mX","6 month experiences")
          ,DataModel("Dr Aditya Kashyap","Dermetologist","https://us.123rf.com/450wm/bbtreesubmission/bbtreesubmission1709/bbtreesubmission170912218/87006929-portrait-of-asian-male-doctor-using-tablet-pc-on-the-desk-isolated-on-white.jpg?ver=6"," 4 year experiences")
            ,DataModel("Dr Renu Kashyap","Neurologist","https://www.doctorcare.ca/wp-content/uploads/2021/05/header-homepage-cropped.png","8 month experiences")
            ,DataModel("Dr Anita Singh","Surgeon","https://media.istockphoto.com/id/531292295/photo/asian-doctor.jpg?s=612x612&w=0&k=20&c=1cy50dD-L3WFcEwmVSbyEu73zTW-jpg-zb10R4MwMs8=","11 month experiences")
            ,DataModel("Dr Vedika Raj","Pediatrician","https://media.istockphoto.com/id/531292293/photo/asian-doctor.jpg?s=612x612&w=0&k=20&c=cBsYDwhWBKzcyhCIJqTVnQUtCVKDF9VPKAXk8UbJTOA=","6 year experiences")
            ,DataModel("Dr Manish Yadav","Cardiologist","https://us.123rf.com/450wm/milkos/milkos2210/milkos221001561/193186069-confident-serious-middle-aged-chinese-male-doctor-in-white-coat-protective-gloves-and-glasses-shows.jpg?ver=6","2.5years experiences")
            ,DataModel("Dr T.P Yadav","Radiologist","https://media.istockphoto.com/id/531239293/photo/asian-doctor.jpg?s=612x612&w=0&k=20&c=zv6HDW7n8nkCnw4DRhdmq3yp8t1igruwCEl-kfUxSUQ=","2.5years experiences")
           ,DataModel("Dr Anupama","Oncologist","https://i.pinimg.com/736x/fb/0e/17/fb0e1739d5b0f708829b7c7e9ad7b847.jpg","2.5years experiences")
            ,DataModel("Dr Abhay","Pathologist","https://thumbs.dreamstime.com/b/male-doctor-portrait-isolated-white-background-55230223.jpg","2.5years experiences")
          ,DataModel("Dr Rekha Sharma","Gynecologist","https://img.freepik.com/free-photo/portrait-asian-doctor-woman-cross-arms-standing-medical-uniform-stethoscope-smiling-camera-white-background_1258-83220.jpg","2.5years experiences")
        ,DataModel("Dr Anshika Raj","","https://media.istockphoto.com/id/1065767638/photo/portrait-of-confident-smiling-female-doctor.jpg?s=612x612&w=0&k=20&c=fZCIlvGCwsejkgsuLqF1YcZJmwOgWYcramPqgDDAjxc=","2.5years experiences")

        )
       val recyclerView=rowView.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager= GridLayoutManager(activity,1)
        val recyclerAdapter= activity?.let { RecyclerViewAdapter(it,data) }
        recyclerView.adapter=recyclerAdapter
        return rowView
   }


}

