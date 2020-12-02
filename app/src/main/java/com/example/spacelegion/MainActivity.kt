package com.example.spacelegion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToGnuLinux = findViewById<Button>(R.id.gnu_linux)

        goToGnuLinux.setOnClickListener {
            val intent = Intent(this, GNULinux::class.java)
            startActivity(intent)
        }
        val goToAndroid = findViewById<Button>(R.id.android_button)

        goToAndroid.setOnClickListener {
            val intent = Intent(this, Android::class.java)
            startActivity(intent)
        }
        val goToWeb = findViewById<Button>(R.id.security_button)

        goToWeb.setOnClickListener {
            val intent = Intent(this, ComingSoon::class.java)
            startActivity(intent)
        }
        val goToPrivacy = findViewById<Button>(R.id.privacy_button)

        goToPrivacy.setOnClickListener {
            val intent = Intent(this, Privacy::class.java)
            startActivity(intent)
        }
        val goToServers = findViewById<Button>(R.id.servers_button)

        goToServers.setOnClickListener {
            val intent = Intent(this, Servers::class.java)
            startActivity(intent)
        }
        val goToOthers = findViewById<Button>(R.id.misc_button)

        goToOthers.setOnClickListener {
            val intent = Intent(this, Other::class.java)
            startActivity(intent)
        }
        val goToAbout = findViewById<Button>(R.id.about_button)

        goToAbout.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }
}