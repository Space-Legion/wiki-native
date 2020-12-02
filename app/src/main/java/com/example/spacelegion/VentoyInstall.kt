package com.example.spacelegion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class VentoyInstall : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventoy_install)

        val goToVenotyGuide = findViewById<WebView>(R.id.visit_ventoy_install)
        goToVenotyGuide.loadUrl("https://space-legion.github.io/ventoy.html")

        val goToVentoyGuideSettings = goToVenotyGuide.settings
        goToVentoyGuideSettings.javaScriptEnabled = true
        goToVenotyGuide.webViewClient = WebViewClient()
    }
}