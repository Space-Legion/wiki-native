package com.example.spacelegion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class GNULinux : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g_n_u_linux)

        val goToArchInstall = findViewById<Button>(R.id.arch_install)
        goToArchInstall.setOnClickListener {
            val intent = Intent(this, ArchInstall::class.java)
            startActivity(intent)
        }
        val goToWindowManagers = findViewById<Button>(R.id.window_managers)
        goToWindowManagers.setOnClickListener {
            val intent = Intent(this, WindowManagers::class.java)
            startActivity(intent)
        }
        val goToKVM = findViewById<Button>(R.id.kvm_install)
        goToKVM.setOnClickListener {
            val intent = Intent(this, KVM::class.java)
            startActivity(intent)
        }

        val goToVBInstall = findViewById<Button>(R.id.virtualBox_install)
        goToVBInstall.setOnClickListener {
            val intent = Intent(this, VirtualboxArch::class.java)
            startActivity(intent)
        }

        val goToVentoy = findViewById<Button>(R.id.ventoy_guide)
        goToVentoy.setOnClickListener {
            val intent = Intent(this, VentoyInstall::class.java)
            startActivity(intent)
        }
    }
}