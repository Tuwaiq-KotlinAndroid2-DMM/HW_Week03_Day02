package com.example.hw_w3_day2_spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import org.intellij.lang.annotations.Language

class MainActivity : AppCompatActivity() /**AdapterView.OnItemSelectedListener*/{

 /*
 var LanguageList = arrayOf("English","Arabic","French","Italian","Hindi","German","Russian")
    var spinnerLanguage = findViewById<Spinner>(R.id.spinnerLanguage)
    var textViewSelectedLang = findViewById<TextView>(R.id.textViewSelectedLang)
  */
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //spinnerLanguage!!.setOnItemSelectedListener(this)
     var LanguageList = arrayOf("English","Arabic","French","Italian","Hindi","German","Russian")
     var spinnerLanguage = findViewById<Spinner>(R.id.spinnerLanguage)
     var textViewSelectedLang = findViewById<TextView>(R.id.textViewSelectedLang)


     spinnerLanguage.adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,LanguageList)
       // arrayadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
       // spinnerLanguage!!.setAdapter(arrayadapter)
     spinnerLanguage?.onItemSelectedListener= object :AdapterView.OnItemSelectedListener{

         override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
             textViewSelectedLang!!.text = "Selected : "+LanguageList[position]
         }

         override fun onNothingSelected(arg0: AdapterView<*>) {

         }
     }


    }


}