package com.example.pocandroidanimapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun switchActivityTranslation(view: View){
        val intent = Intent(this, ActivityTranslation::class.java)
        startActivity(intent)
    }

    fun switchActivitySpringAnimation(view: View) {
        val intent = Intent(this, ActivitySpringAnimation::class.java)
        startActivity(intent)
    }

    fun switchActivityScalling(view: View) {
        val intent = Intent(this, ActivityScalling::class.java)
        startActivity(intent)
    }

    fun switchActivityAnimatorSet(view: View) {
        val intent = Intent(this, ActivityAnimatorSet::class.java)
        startActivity(intent)
    }

    fun switchActivityRotate(view: View) {
        val intent = Intent(this, ActivityRotate::class.java)
        startActivity(intent)
    }

    fun switchActivityAlpha(view: View) {
        val intent = Intent(this, ActivityAlpha::class.java)
        startActivity(intent)
    }

    fun switchActivityArgbEvaluator(view: View) {
        val intent = Intent(this, ActivityArgbEvaluator::class.java)
        startActivity(intent)
    }

    fun switchActivitySceneTransitionManager(view: View) {
        val intent = Intent(this, ActivitySceneTransitionManager::class.java)
        startActivity(intent)
    }
}
