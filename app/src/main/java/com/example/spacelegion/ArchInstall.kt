package com.example.spacelegion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class ArchInstall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arch_install)

        val goToArchUEFIInstall = findViewById<Button>(R.id.arch_install_uefi)
        goToArchUEFIInstall.setOnClickListener {
            val intent = Intent(this, ArchInstallUEFi::class.java)
            startActivity(intent)
        }
        val goToArchLegacyInstall = findViewById<Button>(R.id.arch_install_legacy)
        goToArchLegacyInstall.setOnClickListener {
            val intent = Intent(this, ArchInstallLegacy::class.java)
            startActivity(intent)
        }
    }
}