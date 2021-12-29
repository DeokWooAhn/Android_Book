package com.example.myviewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HiAdapter(private val his: List<Hi>): RecyclerView.Adapter<HiAdapter.HiViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        HiViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_viewpager, parent, false)
        )

    override fun onBindViewHolder(holder: HiViewHolder, position: Int) {
        holder.bind(his[position])
    }

    override fun getItemCount() = his.size

    class HiViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        private val hiTextView: TextView = itemView.findViewById(R.id.hiTextView)

        fun bind(hi: Hi) {
            hiTextView.text = hi.hi
        }
    }
}