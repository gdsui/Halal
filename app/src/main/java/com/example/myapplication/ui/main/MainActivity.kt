package com.example.myapplication.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.myapplication.ui.choose.ChooseLanguagesActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        Handler().postDelayed({
                              val intent=Intent(applicationContext, ChooseLanguagesActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}