package com.example.spinnerexamplehw

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

        var spinner = findViewById<Spinner>(R.id.spinnerLanguage)

        var textViewSelectedLanguage = findViewById<TextView>(R.id.textViewSelectedlanguage)

        var languages = arrayOf("Arabic","English","Spanish","French")

        spinner.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, languages)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
                var result = findViewById<TextView>(R.id.textViewSelectedlanguage)
                result.text = "${languages[position]}"
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}

        }

    }
}