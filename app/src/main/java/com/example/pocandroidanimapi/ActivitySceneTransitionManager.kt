package com.example.pocandroidanimapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Scene
import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup

class ActivitySceneTransitionManager : AppCompatActivity() {

    lateinit var sceneRoot: ViewGroup
    lateinit var scene1: Scene
    lateinit var scene2: Scene

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene_transition_manager)

        sceneRoot = findViewById(R.id.scene_root)
        scene1 = Scene.getSceneForLayout(sceneRoot, R.layout.scene1, this)
        scene2 = Scene.getSceneForLayout(sceneRoot, R.layout.scene2, this)
    }

    fun scene1TransitionManager(view: View) {
        TransitionManager.go(scene1)
    }

    fun scene2TransitionManager(view: View) {
        TransitionManager.go(scene2)
    }
}