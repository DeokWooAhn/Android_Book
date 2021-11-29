package com.example.myRecyclerView.recyclerVIew

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myRecyclerView.R

class Adapter(private val context: Context) : RecyclerView.Adapter<MyViewHolder>() {

    var data = listOf<MyData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemVIew = LayoutInflater.from(context).inflate(R.layout.item_recycler, parent, false)
        return MyViewHolder(itemVIew)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}