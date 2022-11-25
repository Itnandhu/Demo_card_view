package com.example.recyclerviewdemo.Players

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportsapp.R

class PlayersFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<PlayersAdapter.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_players, container, false)

        //val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        // recyclerview.setLayoutManager(GridLayoutManager(this, 2))

        layoutManager = LinearLayoutManager(activity)

        val data = ArrayList<PlayersViewModel>()

        val adapter = PlayersAdapter(data)

        for (i in 1..20) {
            data.add(PlayersViewModel(R.id.ivPlayer, "Cristiano Ronaldo", "Forward"))
        }
        return view


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}