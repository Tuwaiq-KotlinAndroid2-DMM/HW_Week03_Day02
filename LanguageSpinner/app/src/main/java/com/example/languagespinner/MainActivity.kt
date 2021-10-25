package com.example.languagespinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.AdapterView
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var LanguageList = arrayOf("Arabic","English","Spanish","Japanese")
        var spinner = findViewById<Spinner>(R.id.spinnerLanguage)
        spinner.adapter=ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,LanguageList)
        //var selected = spinner.selectedItem.toString()
        //textViewLanguage.text=selected
        spinner?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            var textViewLanguage = findViewById<TextView>(R.id.textView)
            override fun onNothingSelected(parent: AdapterView<*>?) {
                    textViewLanguage.text=""
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var selected = parent?.getItemAtPosition(position).toString()
                textViewLanguage.text=selected
            }

        }

    }
}