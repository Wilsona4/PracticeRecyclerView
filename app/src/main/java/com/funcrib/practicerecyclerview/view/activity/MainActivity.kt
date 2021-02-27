package com.funcrib.practicerecyclerview.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.funcrib.practicerecyclerview.R
import com.funcrib.practicerecyclerview.adapter.TabLayoutStateAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = view_pager
        val tabLayout: TabLayout = tab_layout

        val adapter = TabLayoutStateAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "ANDROID"
                1 -> tab.text = "IOS"
                2 -> tab.text = "GLOBAL"
            }
        }.attach()
    }
}
