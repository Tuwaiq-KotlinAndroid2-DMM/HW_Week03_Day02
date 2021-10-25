package com.twqe.myapplication

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
        var languages = arrayOf(
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
            "Other"
        )
        var textViewSelectedLanguage = findViewById<TextView>(R.id.textViewSelectedLanguage)

        var spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, languages)
/*        val array_adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, list_of_items)
array_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)*/
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
                var result = findViewById<TextView>(R.id.textViewSelectedLanguage)
                result.text = "Selected: ${languages[position]}"
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}


        }

    }
}
