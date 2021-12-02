package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var clickCount=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickCountDisplayValue = findViewById<TextView>(R.id.clickCountView)
        val clickMeButton = findViewById<TextView>(R.id.clickButton)
        clickMeButton.setOnClickListener()
        {
            clickCount++
            clickCountDisplayValue.text = "Button is $clickCount"
        }
    }
}