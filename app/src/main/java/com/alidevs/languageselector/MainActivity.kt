package com.alidevs.languageselector

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

		val selectedLanguageTV = findViewById<TextView>(R.id.selectedLanguageTextView)
		val languagesSpinner = findViewById<Spinner>(R.id.languagesSpinner)

		val availableLanguages = arrayOf("Spanish", "English", "Hindi/Urdu", "Arabic", "Portuguese", "Russian", "Japanese", "German", "French", "Korean")

		languagesSpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, availableLanguages)

		languagesSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
			override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
				selectedLanguageTV.text = "Selected: ${availableLanguages[position]}"
			}

			override fun onNothingSelected(p0: AdapterView<*>?) {}
		}
	}
}