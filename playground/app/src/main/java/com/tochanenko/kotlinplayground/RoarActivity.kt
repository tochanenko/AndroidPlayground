package com.tochanenko.kotlinplayground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class RoarActivity : AppCompatActivity() {

    private lateinit var viewKus : View
    private lateinit var viewPurrLeft : View
    private lateinit var viewPurrRight : View
    private lateinit var textTiger : TextView
    private lateinit var imageTiger : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roar)

        connectViews()

        viewKus.setOnClickListener {
            textTiger.text = getString(R.string.kus)
        }

        viewPurrLeft.setOnClickListener {
            textTiger.text = getString(R.string.purr)
        }

        viewPurrRight.setOnClickListener {
            textTiger.text = getString(R.string.purr)
        }

        imageTiger.setOnClickListener {
            textTiger.text = getString(R.string.click_the_tiger)
        }

    }

    //  Connects Kotlin and XML
    private fun connectViews() {
        viewKus = findViewById(R.id.viewKus)
        viewPurrLeft = findViewById(R.id.viewPurrLeft)
        viewPurrRight = findViewById(R.id.viewPurrRight)
        textTiger = findViewById(R.id.textTiger)
        imageTiger = findViewById(R.id.imageTiger)
    }
}
