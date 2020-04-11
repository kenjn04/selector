package com.sample.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        normal.setOnClickListener {
            icon.isPressed = false
            icon.isEnabled = true
            icon.isSelected = false
        }
        pressed.setOnClickListener {
            icon.isPressed = true
            icon.isEnabled = true
            icon.isSelected = false
        }
        selected.setOnClickListener {
            icon.isPressed = false
            icon.isEnabled = true
            icon.isSelected = true
        }
        disabled.setOnClickListener {
            icon.isPressed = false
            icon.isEnabled = false
            icon.isSelected = false
        }
    }
}
