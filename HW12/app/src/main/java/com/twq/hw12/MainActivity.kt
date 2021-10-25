package com.twq.hw12

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
        var languages = arrayOf("English", "French", "Spanish", "Hindi", "Russian", "Telugu", "Chinese", "German", "Portuguese", "Arabic", "Dutch", "Urdu", "Italian", "Tamil", "Persian", "Turkish", "Other")

        var spinner = findViewById<Spinner>(R.id.spinnerLanguage)
        var textViewResult= findViewById<TextView>(R.id.textViewResult)
        spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, languages)

        spinner.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                textViewResult.text="selected: "
                if (parent != null) {
                    parent.getItemAtPosition(position)
                }
                if (parent != null) {
                    textViewResult.append(parent.getItemAtPosition(position).toString())
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                textViewResult.text="nothing is selected"
            }
        }

    }


}