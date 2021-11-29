package com.example.myRecyclerView.recyclerVIew

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myRecyclerView.R

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val image : ImageView = itemView.findViewById(R.id.image)
    val tv_name : TextView = itemView.findViewById(R.id.tv_name)
    val tv_age : TextView = itemView.findViewById(R.id.tv_age)

    fun bind(myData: MyData) {
        Glide.with(itemView).load(myData.img).into(image)
        tv_name.text = myData.name
        tv_age.text = myData.age.toString()
    }
}