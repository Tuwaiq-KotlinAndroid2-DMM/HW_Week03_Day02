package com.example.hwweek3day2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var countryList = arrayOf(
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
            "Urdu",
            "Italian"
        )
        var spinner = findViewById<Spinner>(R.id.spinner)
        var languageViewer = findViewById<TextView>(R.id.languageViewer)
        spinner.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, countryList)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                languageViewer.text = "Selected: ${countryList[position]}"
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}