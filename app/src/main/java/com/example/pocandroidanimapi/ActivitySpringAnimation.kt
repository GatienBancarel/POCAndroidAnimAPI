package com.example.pocandroidanimapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce

class ActivitySpringAnimation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spring_animation)
    }

    fun springAnimation(view: View) {
        val springAnim = findViewById<View>(R.id.viewSpringAnimation).let { img ->
            SpringAnimation(img, DynamicAnimation.TRANSLATION_Y, 0f).apply {
                setStartVelocity(2500.0F)
                spring.stiffness = SpringForce.STIFFNESS_VERY_LOW
                spring.dampingRatio = SpringForce.DAMPING_RATIO_HIGH_BOUNCY

            }
        }
        springAnim.start()
    }
}