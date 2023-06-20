package com.example.doctorhunt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerViewAdapter(
    val context: Context,
    val datalist:List<DataModel>


):
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.customlistview,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder:RecyclerViewAdapter.ViewHolder, position: Int) {
        val data =datalist[position]
        holder.description.text=data.description
        holder.title.text=data.title
        holder.experience.text=data.experience

        Glide.with(context!!).load(data.image).into(holder.image)

    }

    override fun getItemCount(): Int {
        return datalist.size
    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image=itemView.findViewById<ImageView>(R.id.image)
        val title=itemView.findViewById<TextView>(R.id.title)
        val description=itemView.findViewById<TextView>(R.id.decription)
        val experience=itemView.findViewById<TextView>(R.id.experience)

    }

}

