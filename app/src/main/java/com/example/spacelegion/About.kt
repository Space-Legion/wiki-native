package com.example.spacelegion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val visitSarosx = findViewById<TextView>(R.id.lead_dev)

        visitSarosx.setOnClickListener {
            val url = "https://github.com/sarosx"
            startActivity(Intent(Intent.ACTION_VIEW).apply {
                 data = Uri.parse(url)
            })
        }
        val visitNebula = findViewById<TextView>(R.id.maintainer_desginer)

        visitNebula.setOnClickListener {
            val url = "https://github.com/nebulaxyz"
            startActivity(Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
            })
        }
    }
}