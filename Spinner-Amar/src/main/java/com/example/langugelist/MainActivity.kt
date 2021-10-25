package com.example.langugelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var spinnerListLanguges= arrayListOf("Arabic","English","French","Spanish","Portuguese","German","Russian","Italian")
        var spinner=findViewById<Spinner>(R.id.spinnerListLanguges)
        spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1)

    }
}