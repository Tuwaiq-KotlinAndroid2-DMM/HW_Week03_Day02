package com.example.hw9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var languagelist= arrayOf<String>("English","French","Spanish","Arabic","Urdu","Turkish")
        var spinnerlanguage =findViewById<Spinner>(R.id.spinnerLanguage)
        var textViewLanguage = findViewById<TextView>(R.id.textViewLanguage)


        spinnerlanguage.adapter=ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,languagelist)

        spinnerlanguage.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                textViewLanguage.text = "Selected: "
                parent.getItemAtPosition(position)
                textViewLanguage.append(parent.getItemAtPosition(position).toString())
            }

            override fun onNothingSelected(parent: AdapterView<*>?) { }

        }
    }
}
