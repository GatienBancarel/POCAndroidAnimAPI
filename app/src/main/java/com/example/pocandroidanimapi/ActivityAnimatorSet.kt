package com.example.pocandroidanimapi

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_animator_set.*

class ActivityAnimatorSet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animator_set)
    }

    fun animatorSet(view: View) {
        val scaleDownX = ObjectAnimator.ofFloat(viewAnimatorSet, "scaleX", 1f)
        val scaleDownY = ObjectAnimator.ofFloat(viewAnimatorSet, "scaleY", 1f)
        val scaleUpX = ObjectAnimator.ofFloat(viewAnimatorSet, "scaleX", 2f)
        val scaleUpY = ObjectAnimator.ofFloat(viewAnimatorSet, "scaleY", 2f)
        scaleDownX.duration = 2000
        scaleDownY.duration = 2000
        scaleUpX.duration = 2000
        scaleUpY.duration = 2000

        AnimatorSet().apply {
            play(scaleUpX).before(scaleUpY)
            play(scaleDownX).after(scaleUpY)
            play(scaleDownY).after(scaleDownX)
            start()
        }
    }
}