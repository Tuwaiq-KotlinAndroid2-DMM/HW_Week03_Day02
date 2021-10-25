package com.example.hww3d2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var countrylist = arrayOf(
            "English",
            "French",
            "Spanish",
            "Hindi",
            "Russian",
            "Telugu",
            "Chinese",
            "German",
            "Portuguese",
            "Arabic",
            "Dutch",
            "Urdu"
        )
        var spinner = findViewById<Spinner>(R.id.spinner)
        var textView = findViewById<TextView>(R.id.textView)
        spinner.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, countrylist)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                textView.text = "Selected: ${countrylist[position]}"
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            // textView!!.text = "Selected : "+countrylist
        }
    }

}