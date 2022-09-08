package com.twaun95.workoutmemo.presentation.test

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TestViewPageAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    private val pageList = mutableListOf<Fragment>()

    override fun getItemCount(): Int {
        return pageList.size
    }

    override fun createFragment(position: Int): Fragment {
        return pageList[position]
    }

    fun addFragment(newFragment: Fragment) { pageList.add(newFragment) }
}