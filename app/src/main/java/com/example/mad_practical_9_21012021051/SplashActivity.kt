package com.example.mad_practical_9_21012021051

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.widget.ImageView

class SplashActivity : AppCompatActivity(),AnimationListener {
    lateinit var uvpceanimation: AnimationDrawable
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val uvpceimage = findViewById<ImageView>(R.id.uvpce)
        uvpceimage.setBackgroundResource(R.drawable.uvpce_animation)
        uvpceanimation =uvpceimage.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus)
        {
            uvpceanimation.start()
        }
        else{
           uvpceanimation.stop()
        }

        super.onWindowFocusChanged(hasFocus)
    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {

    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
}