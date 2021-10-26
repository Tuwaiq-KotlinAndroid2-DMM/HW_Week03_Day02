package com.example.hw10partii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }




    fun signUp(view: View) {
        var name = findViewById<EditText>(R.id.name)
        var email = findViewById<EditText>(R.id.email)
        var phone = findViewById<EditText>(R.id.phone)
        var gender = findViewById<EditText>(R.id.gender)
        val User: ArrayList<String> = ArrayList()
        var Name = name.text.toString()
        var Email = email.text.toString()
        var Phone = phone.text.toString()
        var Gender = gender.text.toString()
        User.add(Name)
        User.add(Email)
        User.add(Phone)
        User.add(Gender)



        val intent = Intent(this, SecondActivity::class.java).apply {

           putExtra(AlarmClock.EXTRA_MESSAGE, User)


        }
        startActivity(intent)
    }









}