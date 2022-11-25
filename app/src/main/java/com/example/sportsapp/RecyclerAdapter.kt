package com.example.sportsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView


private const val POST_TYPE_CARD = 0
private const val POST_TYPE_TOGGLE = 1
private const val POST_TYPE_ITEM = 2
private const val POST_TYPE_POSITION = 3

class RecyclerAdapter(private val mList: List<recyclerViewModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(recyclerViewModel: recyclerViewModel) {
            val imageView1: ImageView = itemView.findViewById(R.id.ivTeam)
            val imageView2: ImageView = itemView.findViewById(R.id.ivPlayer)
            val textView8: TextView = itemView.findViewById(R.id.tvName)
            val textView10: TextView = itemView.findViewById(R.id.tvTeamName)
            val textView11: TextView = itemView.findViewById(R.id.tvPlayedPosition)
            val textView12: TextView = itemView.findViewById(R.id.tvPosition)
            val textView13: TextView = itemView.findViewById(R.id.tvDurationPlayed)
            val textView14: TextView = itemView.findViewById(R.id.tvDuration)
        }
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(recyclerViewModel: recyclerViewModel) {
            val progressBar: ProgressBar = itemView.findViewById(R.id.progress_bar)
            val textView2: TextView = itemView.findViewById(R.id.tvTouches)
            val textView: TextView = itemView.findViewById(R.id.tvRight)
            val textView1: TextView = itemView.findViewById(R.id.tvRightValue)
            val textView3: TextView = itemView.findViewById(R.id.tvLeft)
            val textView4: TextView = itemView.findViewById(R.id.tvLeftValue)
        }
    }

    class PositionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(recyclerViewModel: recyclerViewModel) {
            val imageView: ImageView = itemView.findViewById(R.id.ivPosition)
            val textView5: TextView = itemView.findViewById(R.id.tvPositions)
            val textView6: TextView = itemView.findViewById(R.id.tvPositionNum)
            val textView7: TextView = itemView.findViewById(R.id.tvTime)
        }
    }

    class ToggleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(recyclerViewModel: recyclerViewModel) {
            val radioGroup: RadioGroup = itemView.findViewById(R.id.myRadioGroup)
            val radioButton: RadioButton = itemView.findViewById(R.id.btnDoctorPartner)
            val radioButton1: RadioButton = itemView.findViewById(R.id.btnStarDoctor)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        if (viewType == POST_TYPE_CARD) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_player_info, parent, false)
            return CardViewHolder(view)

        } else if (viewType == POST_TYPE_TOGGLE) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_toggle, parent, false)
            return ToggleViewHolder(view)
        } else if (viewType == POST_TYPE_ITEM) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_view_design, parent, false)
            return ItemViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_position_design, parent, false)
            return PositionViewHolder(view)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) {
            POST_TYPE_CARD
        } else if (position == 1) {
            POST_TYPE_TOGGLE
        } else if (position == 2) {
            POST_TYPE_ITEM
        } else {
            POST_TYPE_POSITION
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == POST_TYPE_CARD) {
            (holder as CardViewHolder).bind(mList[position])
        } else if (getItemViewType(position) == POST_TYPE_TOGGLE) {
            (holder as ToggleViewHolder).bind(mList[position])
        } else if (getItemViewType(position) == POST_TYPE_ITEM) {
            (holder as ItemViewHolder).bind(mList[position])

        } else {
            (holder as PositionViewHolder).bind(mList[position])
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

}


