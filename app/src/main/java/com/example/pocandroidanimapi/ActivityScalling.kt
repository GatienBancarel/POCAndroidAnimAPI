package com.example.pocandroidanimapi

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_scalling.*

class ActivityScalling : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scalling)
    }

    fun scalling(view: View) {
        viewScalling.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scalling))
    }
}