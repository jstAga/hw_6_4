package com.geektech.hw_6_4

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.geektech.hw_6_4.ui.count.CountFragment
import com.geektech.hw_6_4.ui.history.HistoryFragment
import com.geektech.hw_6_4.ui.operation.OperationFragment

class MainAdapter(activity: FragmentActivity?) : FragmentStateAdapter(activity!!) {
    private val fragmentList = arrayListOf(OperationFragment(), CountFragment(), HistoryFragment())

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}