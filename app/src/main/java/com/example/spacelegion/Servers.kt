package com.example.spacelegion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Servers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servers)

        val goToLinuxServer = findViewById<Button>(R.id.linux_server)

        goToLinuxServer.setOnClickListener {
            val intent = Intent(this, LinuxServer::class.java)
            startActivity(intent)
        }
    }
}