package com.example.animationtaskskt

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView


class MainActivity : AppCompatActivity() {
    private lateinit var iv_sample: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        iv_sample = findViewById(R.id.image_land)
        val b_bounce = findViewById<Button>(R.id.b_zoom)
        val b_sequential = findViewById<Button>(R.id.b_rotate)
        val b_together = findViewById<Button>(R.id.b_fade)
        val b_facebook = findViewById<Button>(R.id.b_blink)
        val b_youtube = findViewById<Button>(R.id.b_move)
        val b_twitter = findViewById<Button>(R.id.b_slide)
        val lottieAnimationView = findViewById<LottieAnimationView>(R.id.lottie_animation)
        b_bounce.setOnClickListener { v: View? ->
            val animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.bounce
            )
            iv_sample.startAnimation(animation)
        }
        b_sequential.setOnClickListener { v: View? ->
            val animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.sequential
            )
            iv_sample.startAnimation(animation)
        }
        b_together.setOnClickListener { v: View? ->
            val animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.together
            )
            iv_sample.startAnimation(animation)
        }
        b_facebook.setOnClickListener { v: View? ->
            lottieAnimationView.setAnimation("facebook.json")
            lottieAnimationView.playAnimation()
        }
        b_youtube.setOnClickListener { v: View? ->
            lottieAnimationView.setAnimation("you_tube.json")
            lottieAnimationView.playAnimation()
        }
        b_twitter.setOnClickListener { v: View? ->
            lottieAnimationView.setAnimation("twitter.json")
            lottieAnimationView.playAnimation()
        }
    }
}