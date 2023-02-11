package com.example.notes

import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.VectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //showBackground()
        showAnimation()
        showPenAnimation()
    }

    private fun showAnimation() {
        (iv_home_animation.drawable as AnimationDrawable).start()
    }

    private  fun showPenAnimation() {
        (ivb_create_note.drawable as AnimationDrawable).start()
    }

//    private fun showBackground() {
//        (iv_home_background.drawable as Drawable).setVisible(true,false)
//    }
}