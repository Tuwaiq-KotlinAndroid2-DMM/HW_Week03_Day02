package com.raialz.week3day2hw

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

        var languageList =  arrayOf("English", "French", "Spanish", "Hindi", "Russian", "Telugu", "Chinese", "German", "Portuguese", "Arabic", "Dutch", "Urdu", "Italian", "Tamil", "Persian", "Turkish", "Other")
        var spinner = findViewById<Spinner>(R.id.Spinner)
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

                var selected= parent?.getItemAtPosition(1).toString()
                textViewLanguage.text=selected
            }
            }
        }
    }
