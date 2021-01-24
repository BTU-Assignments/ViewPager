package com.example.viewpager.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.fragments.FragmentOne
import com.example.viewpager.fragments.FragmentTwo


class ViewPagerFragmentAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> FragmentOne()
            1 -> FragmentTwo()
            else -> FragmentOne()
        }

    }
}
