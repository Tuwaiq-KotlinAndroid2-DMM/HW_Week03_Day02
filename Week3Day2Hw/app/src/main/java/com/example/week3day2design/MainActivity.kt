package com.example.week3day2design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countryList = arrayOf("Arabic","English","French","Russian","Spanish","Hindi")
        var spinnerList = findViewById<Spinner>(R.id.spinner)
        spinnerList.adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,countryList)
        //spinnerList.setAdapter(arrayad)
        spinnerList?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            var textViewSpinner = findViewById<TextView>(R.id.TextViewSpinner)
            override fun onNothingSelected(parent: AdapterView<*>?) {
                textViewSpinner.text=""

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var selectedItem = parent?.getItemAtPosition(position).toString()
                textViewSpinner.text = selectedItem
            }
        }



    }
}