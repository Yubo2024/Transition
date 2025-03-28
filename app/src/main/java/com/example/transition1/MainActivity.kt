package com.example.transition1

import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val button = findViewById<Button>(R.id.button)

        val transitionDrawable = imageView.drawable as TransitionDrawable

        button.setOnClickListener {
            transitionDrawable.startTransition(2000)
        }
    }
}
