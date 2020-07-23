package com.example.pocandroidanimapi

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_translation.*

class ActivityTranslation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translation)
    }

    fun translation(view: View) {

        //Method 1
        viewTranslation.startAnimation(AnimationUtils.loadAnimation(this,R.anim.translation))

        //Method 2
        //ObjectAnimator.ofFloat(viewTranslation, "translationY", -1000f).setDuration(2000).start()
    }
}