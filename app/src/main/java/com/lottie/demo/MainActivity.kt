package com.lottie.demo

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.widget.TextView
import com.lottie.demo.R.id.heading1TV
import kotlinx.android.synthetic.main.activity_main.*
import android.view.animation.DecelerateInterpolator



class MainActivity : AppCompatActivity() , SwipeListener{
    val TAG = MainActivity@this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hideActionbar()
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        initAnimationSet()
        initSwipeListener()
    }

    private lateinit var animatorSet: AnimatorSet
    private fun initAnimationSet(){
       animatorSet = AnimatorSet()
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

    var swipes = 0
    var maxSwipes = 4
    var minSwipes=0
    override fun onSwipeLeft() {
        Log.d(TAG, "left swipe")
        if(swipes<maxSwipes)
        {
            swipes++
        }
        screen1EnterAnim()
    }

    override fun onSwipeRight() {
        Log.d(TAG, "right swipe")
        if(swipes>minSwipes)
        {
            swipes--
        }
    }

    override fun onSwipeTop() {

        Log.d(TAG, "top swipe")
    }

    override fun onSwipeBottom() {

        Log.d(TAG, "bottom swipe")
    }

    fun screen1EnterAnim(){
        val view = findViewById<TextView>(R.id.heading1TV)
        animatorSet.playTogether(
                ObjectAnimator.ofFloat(view, "alpha", 0F, 1F),
                ObjectAnimator.ofFloat(view, "translationX", 800F, 0F)
        )
        animatorSet.interpolator = DecelerateInterpolator()
        animatorSet.setDuration(600);
        animatorSet.start()
    }

    fun screen1ExitAnim(){

    }

    fun screen2EnterAnim(){

    }

    fun screen2ExitAnim(){

    }

    fun screen3EnterAnim(){

    }

    fun screen3ExitAnim(){

    }

    fun screen4EnterAnim(){

    }

    fun screen4ExitAnim(){

    }







































































































}
