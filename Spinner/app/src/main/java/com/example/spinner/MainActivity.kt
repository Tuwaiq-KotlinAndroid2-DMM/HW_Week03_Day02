package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.AdapterView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var LanguageList= arrayOf("Arabic","English","Turkish","Hindi","Italian")
        var spinner= findViewById<Spinner>(R.id.spinnerLanguage)
        var langaugeTextView= findViewById<TextView>(R.id.textViewSelected)

        spinner.adapter=ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,LanguageList)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
                var item = parent.getItemAtPosition(pos).toString()
                langaugeTextView.setText(item)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }


    }
}