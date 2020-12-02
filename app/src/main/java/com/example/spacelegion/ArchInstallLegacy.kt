package com.example.spacelegion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class ArchInstallLegacy : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arch_install_legacy)

        val visitArchLegacy = findViewById<WebView>(R.id.visit_arch_legacy)
        visitArchLegacy.loadUrl("https://space-legion.github.io/arch-legacy.html")

        val visitArchLegacySettings = visitArchLegacy.settings
        visitArchLegacySettings.javaScriptEnabled = true
        visitArchLegacy.webViewClient = WebViewClient()
    }
}