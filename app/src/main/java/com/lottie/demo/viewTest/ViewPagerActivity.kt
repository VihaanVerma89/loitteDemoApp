package com.lottie.demo.viewTest

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.SparseArray
import android.view.Window
import com.lottie.demo.R
import kotlinx.android.synthetic.main.activity_viewpager.*

class ViewPagerActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hideActionbar()
        setContentView(R.layout.activity_viewpager)
        init()
    }

    private fun hideActionbar() {
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        supportActionBar?.hide();
    }

    private fun init(){
        initViewPager()
    }

    lateinit var tourPagerAdapter: TourPagerAdapter
    private fun initViewPager(){
        tourPagerAdapter = TourPagerAdapter(supportFragmentManager, getFragments())
        tourViewPager.adapter = tourPagerAdapter
        tourViewPager.setPageTransformer(false,FadePageTransformer())
    }

    private var fragments : ArrayList<Fragment> = arrayListOf()
    private fun getFragments(): ArrayList<Fragment> {
        fragments.clear()
//        fragments.add(Tour1Fragment())
        fragments.add(Tour2Fragment())
        fragments.add(Tour3Fragment())
        fragments.add(Tour4Fragment())
        fragments.add(Tour5Fragment())
        return fragments
    }
}