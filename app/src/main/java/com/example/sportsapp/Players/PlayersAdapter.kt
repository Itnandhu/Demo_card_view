package com.example.recyclerviewdemo.Players

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportsapp.R

class PlayersAdapter(private val mList: List<PlayersViewModel>) :
    RecyclerView.Adapter<PlayersAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_members, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val imageView: ImageView = itemView.findViewById(R.id.ivPlayer)
        val textView: TextView = itemView.findViewById(R.id.tvName)
        val textView1: TextView = itemView.findViewById(R.id.tvPosition)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val RecyclerViewModel = mList[position]

        holder.imageView.findViewById<ImageView>(R.id.ivPlayer)
        holder.textView.text = RecyclerViewModel.text
        holder.textView1.text = RecyclerViewModel.text1
    }
}