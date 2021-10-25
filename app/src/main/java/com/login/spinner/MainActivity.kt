package com.login.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spinner= findViewById<Spinner>(R.id.spinner)
        var txtselected = findViewById<TextView>(R.id.textViewSelected)
        var languagelist= arrayOf("italian","English","indian","Spanish","Russian","Chinese","French","German","Turkish","Arabian")


        spinner.adapter= ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,languagelist)


        spinner.onItemSelectedListener= object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2:Int, p3:Long){
                txtselected.text= "selected: "+ languagelist[p2]

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }



    }
}


