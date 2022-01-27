package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var mStarAnimationView: StarAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStarAnimationView = findViewById(R.id.animated_view);
    }

    override fun onResume() {
        super.onResume()
        mStarAnimationView.resume()
    }

    override fun onPause() {
        super.onPause()
        mStarAnimationView.pause()
    }
}