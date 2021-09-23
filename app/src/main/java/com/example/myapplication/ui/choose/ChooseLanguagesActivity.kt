package com.example.myapplication.ui.choose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class ChooseLanguagesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_languages)
        supportActionBar?.hide()
        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
    }
}