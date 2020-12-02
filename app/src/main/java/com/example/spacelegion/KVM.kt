package com.example.spacelegion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KVM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k_v_m)

        val goToUbuntu = findViewById<Button>(R.id.ubuntu_kvm)
        goToUbuntu.setOnClickListener {
            val intent = Intent(this, ComingSoon::class.java)
            startActivity(intent)
        }
        val goToFedora = findViewById<Button>(R.id.fedora_kvm)
        goToFedora.setOnClickListener {
            val intent = Intent(this, ComingSoon::class.java)
            startActivity(intent)
        }
        val goToArch = findViewById<Button>(R.id.arch_kvm)
        goToArch.setOnClickListener {
            val intent = Intent(this, ComingSoon::class.java)
            startActivity(intent)
        }
    }
}