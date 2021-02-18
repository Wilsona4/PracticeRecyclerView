package com.funcrib.practicerecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.funcrib.practicerecyclerview.R
import com.funcrib.practicerecyclerview.model.GlobalModel
import kotlinx.android.synthetic.main.global_list_row.view.*

class GlobalRecyclerViewAdapter(var globalList: List<GlobalModel>) :
    RecyclerView.Adapter<GlobalRecyclerViewAdapter.RecyclerViewHolder>() {

    class RecyclerViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.global_list_row, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.itemView.apply {
            tv_name.text = globalList[position].name
            tv_score.text = globalList[position].score.toString()
            tv_position.text = (position + 1).toString()
            iv_android.setImageResource(globalList[position].image)
        }
    }

    override fun getItemCount(): Int {
        return globalList.size
    }
}