package com.twq.hwlanguagespinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var languagesArray = arrayOf("select a language","Arabic","Italiano","Spanish", "Dothraki")
        var spinnerLanguages = findViewById<Spinner>(R.id.spinnerLanguage)

        spinnerLanguages.adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,languagesArray)
        spinnerLanguages.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            var textViewSelectedLanguage = findViewById<TextView>(R.id.textViewSelectedLanguage)
            override fun onNothingSelected(parent: AdapterView<*>?) {


            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var languageSelected = parent?.getItemAtPosition(position).toString()
                if (languageSelected == "select a language"){
                    textViewSelectedLanguage.text = "Please Select a Language"
                } else {
                    textViewSelectedLanguage.text = "Selected language is: $languageSelected"
                }
            }
        }
    }
}