package com.example.hw10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1 = findViewById<EditText>(R.id.num1)
        var num2 = findViewById<EditText>(R.id.num2)
        var btn_sum = findViewById<Button>(R.id.btn_sum)
    }


    fun calculateSum(view: View) {
        var num1 = findViewById<EditText>(R.id.num1)
        var num2 = findViewById<EditText>(R.id.num2)
        var btn_sum = findViewById<Button>(R.id.btn_sum)
        var n1 = num1.text.toString()
        var n2 = num2.text.toString()
        var n3 = n1.toDouble() + n2.toDouble()
        val result = n3.toString()

       val intent = Intent(this, SecondActivity::class.java).apply {

           putExtra(EXTRA_MESSAGE, result)
        }
        startActivity(intent)
    }
}

