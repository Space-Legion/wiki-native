package com.example.spacelegion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import java.nio.file.WatchEvent

class dwmInstall : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dwm_install)

        val visitDWMInstall = findViewById<WebView>(R.id.visit_dwm)
        visitDWMInstall.loadUrl("https://space-legion.github.io/dwm.html")

        val visitDWMInstallSettings = visitDWMInstall.settings
        visitDWMInstallSettings.javaScriptEnabled = true
        visitDWMInstall.webViewClient = WebViewClient()
    }
}