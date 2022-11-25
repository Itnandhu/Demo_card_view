package com.example.recyclerviewdemo.Teams

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportsapp.R

class TeamAdapter(private val mList: List<TeamViewModel>) :
    RecyclerView.Adapter<TeamAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_teams, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val imageView: ImageView = itemView.findViewById(R.id.ivTeam)
        val textView: TextView = itemView.findViewById(R.id.tvTeamName)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val RecyclerViewModel = mList[position]

        holder.imageView.findViewById<ImageView>(R.id.ivTeam)
        holder.textView.text = RecyclerViewModel.text
    }
}