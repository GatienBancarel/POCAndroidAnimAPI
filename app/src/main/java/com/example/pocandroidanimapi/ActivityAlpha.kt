package com.example.pocandroidanimapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_alpha.*

class ActivityAlpha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpha)
    }

    fun Alpha(view: View) {
        viewAlpha.startAnimation(AnimationUtils.loadAnimation(this,R.anim.alpha))
    }
}