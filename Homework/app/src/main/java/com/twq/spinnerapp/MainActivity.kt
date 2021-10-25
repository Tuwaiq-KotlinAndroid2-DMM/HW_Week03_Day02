package com.twq.spinnerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var languageList = arrayOf("Default","Arabic", "English", "Spanish", "Italian", "French","Russian","Persian")
        var spinner = findViewById<Spinner>(R.id.LanguageSpinner)
        var textViewLanguage = findViewById<TextView>(R.id.textViewLanguage)

        spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, languageList)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                textViewLanguage.text = "Selected: "
                parent.getItemAtPosition(position)
                textViewLanguage.append(parent.getItemAtPosition(position).toString())
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
                textViewLanguage.text = "Nothing is Selected"
            }
        }
    }
}
