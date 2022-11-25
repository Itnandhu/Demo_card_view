package com.example.recyclerviewdemo.Members

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportsapp.R

class MembersFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<MembersAdapter.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_members, container, false)
        //val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        // recyclerview.setLayoutManager(GridLayoutManager(this, 2))

        layoutManager = LinearLayoutManager(activity)

        val data = ArrayList<MembersViewModel>()

        val adapter = MembersAdapter(data)

        for (i in 1..20) {
            data.add(MembersViewModel("Erik Ten Hag", "Manager "))

        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}