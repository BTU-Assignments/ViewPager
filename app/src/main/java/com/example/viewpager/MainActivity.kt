package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)

        val viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)

        viewPager.adapter = viewPagerFragmentAdapter

        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            when(position) {
                0 -> {
                    tab.text = "Profile"
                    tab.setIcon(R.drawable.ic_baseline_account_box_24)
                }
                1 -> {
                    tab.text = "Edit Profile"
                    tab.setIcon(R.drawable.ic_baseline_accessibility_24)
                }
            }
        }.attach()

    }
}