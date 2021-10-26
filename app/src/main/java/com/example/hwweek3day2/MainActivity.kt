package com.example.hwweek3day2

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
        var languageList = arrayOf("Arabic","English","Spanish","Chinese","French","Italian","Urdu")
        var spinner = findViewById<Spinner>(R.id.Spinner)
        var myLanguage = findViewById<TextView>(R.id.textView)
        spinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,languageList)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                myLanguage.text = "Selected: ${languageList[position]}"
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}
    }
}
}