package com.example.week3day2hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var LanguageList = arrayOf("Arabic", "English", "Spanish", "Chinese")
        var spinerLanguage = findViewById<Spinner>(R.id.spinnerLangu)

        spinerLanguage.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, LanguageList)


        spinerLanguage?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            var textViewSelectedLan = findViewById<TextView>(R.id.textViewSelectedLan)
            override fun onNothingSelected(parent: AdapterView<*>?) {
                textViewSelectedLan.text = ""
            }

            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?,position: Int,id: Long)
             {
                var selectedItem = parent?.getItemAtPosition(position).toString()
                textViewSelectedLan.text = "Selected language is:  $selectedItem"

            }

        }
    }
}
