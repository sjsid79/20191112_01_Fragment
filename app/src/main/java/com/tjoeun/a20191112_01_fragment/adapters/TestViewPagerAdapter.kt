package com.tjoeun.a20191112_01_fragment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tjoeun.a20191112_01_fragment.fragments.FirstFragment
import com.tjoeun.a20191112_01_fragment.fragments.SecondFragment

class TestViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {

    // 각 위치에 어떤 프래그먼트를 보여줄건지
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                FirstFragment()
            }
            else -> {
                SecondFragment()
            }
        }

//        if (position == 0){
//            return  FirstFragment()
//        }
//        else {
//            return  SecondFragment()
//        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->{
                "첫 탭"
            }
            else -> {
                "두번째 탭"
            }
        }
    }

}