package com.sample.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.ImageView

class ShadowLayout(
    context: Context,
    attrs: AttributeSet?,
    defStyle: Int
): FrameLayout(context, attrs, defStyle) {

    private val shadow: ImageView

    constructor(context: Context) : this(context, null, 0)
    constructor(context: Context, attrs: AttributeSet) : this(context, attrs, 0)

    init {
        shadow = ImageView(context).apply {
            setImageDrawable(resources.getDrawable(R.drawable.icon_normal))
            layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT).apply {
                gravity = Gravity.TOP or Gravity.LEFT
                translationX = 50F
                translationY = 50F
//                translationZ = -50F
            }
        }
        addView(shadow)
    }
}
