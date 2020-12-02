package com.example.spacelegion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Privacy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy)

        val goToAndroidPrivacyGuide = findViewById<Button>(R.id.android_privacy_guide)

        goToAndroidPrivacyGuide.setOnClickListener {
            val intent = Intent(this, AndroidPrivacyGuide::class.java)
            startActivity(intent)
        }
    }
}