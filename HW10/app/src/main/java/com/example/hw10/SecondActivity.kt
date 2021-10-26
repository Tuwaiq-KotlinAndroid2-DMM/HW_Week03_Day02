package com.example.hw10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val result = intent.getStringExtra(EXTRA_MESSAGE)

        val sum = findViewById<TextView>(R.id.show).apply {
            text =result

        }
    }
}