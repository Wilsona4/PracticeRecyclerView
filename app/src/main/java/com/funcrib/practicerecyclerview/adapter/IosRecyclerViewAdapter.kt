package com.funcrib.practicerecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.funcrib.practicerecyclerview.R
import com.funcrib.practicerecyclerview.model.IosModel
import kotlinx.android.synthetic.main.ios_list_row.view.*

class IosRecyclerViewAdapter(var iosList: List<IosModel>) :
    RecyclerView.Adapter<IosRecyclerViewAdapter.RecyclerViewHolder>() {

    class RecyclerViewHolder(var view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        var view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.ios_list_row, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.itemView.apply {
            tv_name.text = iosList[position].name
            tv_score.text = iosList[position].score.toString()
            tv_position.text = (position + 1).toString()
        }
    }

    override fun getItemCount(): Int {
        return iosList.size
    }
}