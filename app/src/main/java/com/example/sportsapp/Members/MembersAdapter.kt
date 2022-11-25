package com.example.recyclerviewdemo.Members

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportsapp.R

class MembersAdapter(private val mList: List<MembersViewModel>) :
    RecyclerView.Adapter<MembersAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_members, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val textView: TextView = itemView.findViewById(R.id.tvName)
        val textView1: TextView = itemView.findViewById(R.id.tvPosition)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val RecyclerViewModel = mList[position]

        holder.textView.text = RecyclerViewModel.text
        holder.textView1.text = RecyclerViewModel.text1
    }
}