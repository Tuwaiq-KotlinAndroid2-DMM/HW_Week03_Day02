package com.example.hw_week03_day02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Country Model
        var languageList = arrayOf("English","Spanish","Arabic","French","Japanese","Korean","Portuguese","Turkish","German","Italian")

        //link spinner
        var spnLanguage = findViewById<Spinner>(R.id.spinnerLanguage)

        //get adapter and set layout and model
        spnLanguage.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,languageList)
        //action when selected and item in spinner
        spnLanguage.setOnItemSelectedListener(object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var result = findViewById<TextView>(R.id.textViewSelectionResult)
                result.text = "Selected: ${languageList[position]}"
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        })
    }
}