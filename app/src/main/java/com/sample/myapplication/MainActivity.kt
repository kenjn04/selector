package com.sample.myapplication

import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        stateTest()
        animTest()
        tintTest()
    }

    private fun tintTest() {
        val color = Color.BLUE
        // https://developer.android.com/reference/android/widget/ImageView#attr_android:tint
        // https://developer.android.com/reference/android/graphics/PorterDuff.Mode
        tint01.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC)
        tint02.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP)
        tint03.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN)
        tint04.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_OUT)
        tint05.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_OVER)
        tint21.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.DST)
        tint22.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.DST_ATOP)
        tint23.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.DST_IN)
        tint24.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.DST_OUT)
        tint25.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.DST_OVER)

        tint06.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.CLEAR)
        tint26.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.CLEAR)

        tint07.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.ADD)
        tint08.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.CLEAR)
        tint09.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.DARKEN)
        tint10.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.LIGHTEN)
        tint27.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY)
        tint28.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.OVERLAY)
        tint29.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SCREEN)
        tint30.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.XOR)
    }

    private fun stateTest() {
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

    private fun animTest() {
        (anim.drawable as AnimationDrawable).start()
/*
        val handler = Handler()
        handler.postDelayed({
            (anim.drawable as AnimationDrawable).stop()
        }, 5000)
 */
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }

    private fun hideSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }
}

