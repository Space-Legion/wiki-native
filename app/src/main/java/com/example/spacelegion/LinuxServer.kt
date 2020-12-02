package com.example.spacelegion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LinuxServer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linux_server)

        val goToDebianServer = findViewById<Button>(R.id.debian_server)

        goToDebianServer.setOnClickListener {
            val intent = Intent(this, ComingSoon::class.java)
            startActivity(intent)
        }
        val goToCentOSServer = findViewById<Button>(R.id.centos_server)

        goToCentOSServer.setOnClickListener {
            val intent = Intent(this, ComingSoon::class.java)
            startActivity(intent)
        }
    }
}