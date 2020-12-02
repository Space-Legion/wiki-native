package com.example.spacelegion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class BSPWMInstall : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_s_p_w_m_install)

        val visitBSPWMInstall = findViewById<WebView>(R.id.visit_bspwm)
        visitBSPWMInstall.loadUrl("https://space-legion.github.io/bspwm.html")

        val visitBSPWMInstallSettings = visitBSPWMInstall.settings
        visitBSPWMInstallSettings.javaScriptEnabled = true
        visitBSPWMInstall.webViewClient = WebViewClient()
    }
}