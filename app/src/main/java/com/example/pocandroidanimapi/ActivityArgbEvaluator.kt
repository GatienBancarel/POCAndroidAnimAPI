package com.example.pocandroidanimapi

import android.animation.ArgbEvaluator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_argb_evaluator.*

class ActivityArgbEvaluator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_argb_evaluator)

        seekBarColor.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                changeColor()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }

    fun changeColor() {
        val color = ArgbEvaluator().evaluate(
            seekBarColor.progress.toFloat() / seekBarColor.max,
            ContextCompat.getColor(this,R.color.violet),
            ContextCompat.getColor(this,R.color.orange)
        ) as Int
        viewArgbEvaluator.setBackgroundColor(color)
    }
}