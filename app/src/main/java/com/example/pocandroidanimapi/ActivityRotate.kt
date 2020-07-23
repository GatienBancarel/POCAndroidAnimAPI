package com.example.pocandroidanimapi

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_rotate.*

class ActivityRotate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotate)
    }

    fun rotate(view: View) {

        //Method 1
        viewRotate.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotate))

        //Method 2
        //ObjectAnimator.ofFloat(viewRotate, "rotation", 0f, 360f).setDuration(2000).start()
    }
}