package com.example.winterlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.winterlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var winter : WinterLayout

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val winter = findViewById<WinterLayout>(R.id.winter)
    }
    fun start(view: View) {
        winter.startWinter()
    }

    fun stop(view: View) {
        winter.stopWinter()
    }
}