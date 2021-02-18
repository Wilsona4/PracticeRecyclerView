package com.funcrib.practicerecyclerview.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.funcrib.practicerecyclerview.R
import com.funcrib.practicerecyclerview.adapter.IosRecyclerViewAdapter
import com.funcrib.practicerecyclerview.model.GlobalModel
import com.funcrib.practicerecyclerview.model.IosModel
import kotlinx.android.synthetic.main.fragment_ios.*


class IosFragment : Fragment() {
    private val iosList = generateIosList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ios, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ios_recyclerView.adapter = IosRecyclerViewAdapter(iosList)
        ios_recyclerView.layoutManager = LinearLayoutManager(context)
    }

    private fun generateIosList(): List<IosModel> {
        val globalObject = GlobalFragment()
        val globalList: List<GlobalModel> = globalObject.globalList
        val iosList = ArrayList<IosModel>()

        globalList.mapTo(iosList) {
            IosModel(it.name, it.score)
        }
        return iosList
    }
}