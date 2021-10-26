package com.example.hw10partii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val name = findViewById<TextView>(R.id.name)
        val numbersList = intent.getSerializableExtra("EXTRA_MESSAGE") as ArrayList<String>?

        if (numbersList != null) {
            var n = numbersList[0]
            var e = numbersList[1]
            var p = numbersList[2]
            var g = numbersList[3]

            val Name = findViewById<TextView>(R.id.name).apply {
                text = n

            }
            val Email = findViewById<TextView>(R.id.email).apply {
                text = e

            }
            val Phone = findViewById<TextView>(R.id.phone).apply {
                text = p

            }
            val Gender = findViewById<TextView>(R.id.gender).apply {
                text = g
            }
        }


    }
}