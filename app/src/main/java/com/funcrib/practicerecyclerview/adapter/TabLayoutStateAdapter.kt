package com.funcrib.practicerecyclerview.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.funcrib.practicerecyclerview.view.fragment.AndroidFragment
import com.funcrib.practicerecyclerview.view.fragment.GlobalFragment
import com.funcrib.practicerecyclerview.view.fragment.IosFragment

class TabLayoutStateAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private val numOfTabs: Int = 3

    override fun getItemCount(): Int {
        return numOfTabs
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AndroidFragment()
            1 -> IosFragment()
            2 -> GlobalFragment()
            else -> AndroidFragment()
        }
    }
}