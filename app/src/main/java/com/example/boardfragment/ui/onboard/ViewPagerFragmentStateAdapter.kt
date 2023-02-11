package com.example.boardfragment.ui.onboard

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.boardfragment.R

class ViewPagerFragmentStateAdapter (fm: FragmentActivity,
                                     private var listenerSkip:() -> Unit,
                                     private var  listenerNext:() -> Unit) :FragmentStateAdapter(fm) {

    private val list  = arrayOf(BoardModel(R.drawable.img231,"WELCOME")
        ,BoardModel(R.drawable.img666,"ЭТО дз 5",false),
        BoardModel(R.drawable.img777,"проблемы были с модулем ",false)
            , BoardModel(R.drawable.img506,"Таджибаев Розимухамммед ",true)
    )

    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = PnBoardPageFragment(listenerSkip,listenerNext)
        val getData = bundleOf("joy" to list[position])
        fragment.arguments = getData
        return fragment

    }
}