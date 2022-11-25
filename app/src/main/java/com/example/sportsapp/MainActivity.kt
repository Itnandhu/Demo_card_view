package com.example.sportsapp


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {


    private var mList: List<recyclerViewModel> = ArrayList()
    private val RecyclerAdapter: RecyclerAdapter = RecyclerAdapter(mList)

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)

        val layoutManager =
            AutoFitGridLayoutManager(this, resources.getDimensionPixelSize(R.dimen.col_width))
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                when (position) {
                    0, 1 -> return 2
                    else -> return 1
                }
            }
        }
        recyclerview.layoutManager = layoutManager

        val itemDecoration =
            ItemOffsetDecoration(resources.getDimensionPixelSize(R.dimen.item_offset))
        //  recyclerview.addItemDecoration(itemDecoration);

        val data = ArrayList<recyclerViewModel>()
        for (i in 1..20) {
            data.add(
                recyclerViewModel(
                    R.id.progress_bar,
                    "Right ",
                    "200",
                    "Touches",
                    "Left",
                    "25",
                    R.id.ivPosition,
                    "short Possession",
                    "100",
                    "Min",
                    R.id.ivTeam,
                    R.id.ivPlayer,
                    "Karim Benzema",
                    "Real Madrid",
                    "Played Position",
                    "Right Mid Fielder",
                    "Duration Played",
                    "45 Minutes",
                    R.id.myRadioGroup,
                    "Technical",
                    "Physical"
                )
            )
        }
        val adapter = RecyclerAdapter(data)

        recyclerview.adapter = adapter
    }
}




