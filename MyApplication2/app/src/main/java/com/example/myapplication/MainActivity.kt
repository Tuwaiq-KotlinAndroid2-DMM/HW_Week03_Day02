package com.example.myapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countryList = arrayOf("Arabic", "English", "French", "Italy", "India")
        var s = findViewById<Spinner>(R.id.spinnerCountry)
        var textView = findViewById<TextView>(R.id.textView)
        s.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, countryList)
        s.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
                parent.getItemAtPosition(pos)
                textView.text = "The selection is: "
                textView.append(parent.getItemAtPosition(pos).toString())
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }
    }
}