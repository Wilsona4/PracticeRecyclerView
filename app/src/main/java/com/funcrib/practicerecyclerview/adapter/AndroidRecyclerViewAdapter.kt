package com.funcrib.practicerecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.funcrib.practicerecyclerview.R
import com.funcrib.practicerecyclerview.model.AndroidModel
import kotlinx.android.synthetic.main.android_list_row.view.*

class AndroidRecyclerViewAdapter(var androidList: List<AndroidModel>) :
    RecyclerView.Adapter<AndroidRecyclerViewAdapter.RecyclerViewHolder>() {

    class RecyclerViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.android_list_row, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.itemView.apply {
            tv_name.text = androidList[position].name
            tv_score.text = androidList[position].score.toString()
            tv_position.text = (position + 1).toString()
        }
    }

    override fun getItemCount(): Int {
        return androidList.size
    }
}