package com.gospotcheck.android.gospotcheck.gscandroidinterview

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NationalParksAdapter() :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflatedView = parent.inflate(R.layout.row_view)
    }

}

class NationalParksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val nameTextView: TextView = itemView.findViewById(R.id.parkDesignationTextView)
    private val designationTextView: TextView = itemView.findViewById(R.id.parkDesignationTextView)

}