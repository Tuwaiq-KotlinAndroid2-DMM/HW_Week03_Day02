package com.example.homeworkw3d2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() /*, AdapterView.OnItemSelectedListener*/{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var languagesList = arrayOf("Arabic", "English", "French", "Spanish", "Indian","Urdu","German","Italian","Dutch","Russian","Tamil","Turkish")
        var spinner = findViewById<Spinner>(R.id.spinnerLanguages)
        var selectedLanguageView=findViewById<TextView>(R.id.textViewSelectedLanguage)

        spinner.adapter =ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, languagesList)


        spinner.onItemSelectedListener=object :

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                selectedLanguageView.text="Selected: "+languagesList[p2]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }


}

