package com.funcrib.practicerecyclerview.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.funcrib.practicerecyclerview.R
import com.funcrib.practicerecyclerview.adapter.AndroidRecyclerViewAdapter
import com.funcrib.practicerecyclerview.model.AndroidModel
import com.funcrib.practicerecyclerview.model.GlobalModel
import kotlinx.android.synthetic.main.fragment_android.*


class AndroidFragment : Fragment() {
    private val androidList = generateAndroidList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_android, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        android_recyclerView.adapter = AndroidRecyclerViewAdapter(androidList)
        android_recyclerView.layoutManager = LinearLayoutManager(context)
    }

    private fun generateAndroidList(): List<AndroidModel> {
        val globalObject = GlobalFragment()
        val globalList: List<GlobalModel> = globalObject.globalList
        val androidList = ArrayList<AndroidModel>()

        globalList.mapTo(androidList) {
            AndroidModel(it.name, it.score)
        }
        return androidList
    }
}