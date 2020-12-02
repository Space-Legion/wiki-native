package com.example.spacelegion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WindowManagers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window_managers)

        val goToBSPWMInstall = findViewById<Button>(R.id.bspwm_install)
        goToBSPWMInstall.setOnClickListener {
            val intent = Intent(this, BSPWMInstall::class.java)
            startActivity(intent)
        }

        val goToDWMInstall = findViewById<Button>(R.id.dwm_install)
        goToDWMInstall.setOnClickListener {
            val intent = Intent(this, dwmInstall::class.java)
            startActivity(intent)
        }
    }
}