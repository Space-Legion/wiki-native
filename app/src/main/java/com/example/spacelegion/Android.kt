package com.example.spacelegion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Android : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        val goToAOSPBuild = findViewById<Button>(R.id.aosp_guide)
        goToAOSPBuild.setOnClickListener {
            val intent = Intent(this, ComingSoon::class.java)
            startActivity(intent)
        }
        val goToEtcherGuide = findViewById<Button>(R.id.etcher_droid)
        goToEtcherGuide.setOnClickListener {
            val intent = Intent(this, EtcherDroid::class.java)
            startActivity(intent)
        }
    }
}