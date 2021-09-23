package com.example.myapplication.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainHalalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_halal)
        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController=Navigation.findNavController(this, R.id.fragmentContainerView)
        val appBarConfiguration= AppBarConfiguration(setOf(
            R.id.mainFragment,
            R.id.catalogFragment,
            R.id.menuFragment
        ))
        setupActionBarWithNavController(navController,appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)
    }
}