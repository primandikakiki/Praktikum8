package com.primandika.praktikum8

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(private val mContext: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        // mengatur fragment untuk dipanggil berdasarkan tab
        return if (position == 0) {
            FirstFragment.newInstance()
        } else if (position == 1) {
            SecondFragment.newInstance()
        } else {
            ThirdFragment.newInstance()
        }
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(TAB_TITLES[position])
    }
    override fun getCount(): Int {
        // menentukan jumlah tab
        return 3
    }
    companion object {
        @StringRes
        // judul halaman
        private val TAB_TITLES = intArrayOf(R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3)
    }
}