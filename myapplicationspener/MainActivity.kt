package com.example.myapplicationspener

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
        var languagelist= arrayOf("ARABIC","ENGLISH","KORIAN","SPANISH")
        var result = findViewById<TextView>(R.id.textView)
        var spinner=findViewById<Spinner>(R.id.spinner)
        spinner.adapter=ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,languagelist)

spinner.onItemSelectedListener(object: AdapterView.OnItemSelectedListener{
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
})
    }


}