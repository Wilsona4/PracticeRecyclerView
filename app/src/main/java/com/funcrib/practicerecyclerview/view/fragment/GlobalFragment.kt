package com.funcrib.practicerecyclerview.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.funcrib.practicerecyclerview.R
import com.funcrib.practicerecyclerview.adapter.GlobalRecyclerViewAdapter
import com.funcrib.practicerecyclerview.model.GlobalModel
import kotlinx.android.synthetic.main.fragment_global.*


class GlobalFragment : Fragment() {
    var globalList = generateGlobalList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_global, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        global_recyclerView.adapter = GlobalRecyclerViewAdapter(globalList)
        global_recyclerView.layoutManager = LinearLayoutManager(activity)
    }

    private fun randomScore(): Int {
        return (0..100).random()
    }

    fun generateGlobalList(): List<GlobalModel> {
        val globalList = ArrayList<GlobalModel>()

        globalList.add(GlobalModel("Wilson", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Ransom", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Sophia", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Isaac-Newton", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Darlington", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Precious", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Faith", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Anthonette", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Newton", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Praise", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Joy", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Mercy", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Rasheedat", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Lawrence", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Dami", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Joshua", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Florence", randomScore(), "Android", R.mipmap.android_logo))
        globalList.add(GlobalModel("Benedict", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("King", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Famous", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Tolulope", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Victoria", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Andrew", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Gladys", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Fred", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("George", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Ben", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Lion", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Mary", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Judith", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Frank", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Sunday", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Favour", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Amosede", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Prince", randomScore(), "iOS", R.mipmap.ios_logo))
        globalList.add(GlobalModel("Paul", randomScore(), "iOS", R.mipmap.ios_logo))

        return globalList.sortedWith(compareBy({ -it.score }, { it.name }, { it.stack }))
    }
}