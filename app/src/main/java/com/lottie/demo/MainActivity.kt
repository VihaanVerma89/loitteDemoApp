package com.lottie.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , SwipeListener{
    val TAG = MainActivity@this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hideActionbar()
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        initSwipeListener()
    }

    private fun hideActionbar() {
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        supportActionBar?.hide();
    }

    private lateinit var listener: OnSwipeTouchListener
    private fun initSwipeListener() {
        listener = OnSwipeTouchListener(this, this)
        rootCL.setOnTouchListener(listener)
    }

    var position = 0;
    override fun onSwipeLeft() {
        Log.d(TAG, "left swipe")
        if(position >0)
        {
        }
    }

    override fun onSwipeRight() {
        Log.d(TAG, "right swipe")
    }

    override fun onSwipeTop() {

        Log.d(TAG, "top swipe")
    }

    override fun onSwipeBottom() {

        Log.d(TAG, "bottom swipe")
    }


}
