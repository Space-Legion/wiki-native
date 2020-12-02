package com.example.spacelegion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class ArchInstallUEFi : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arch_install_u_e_fi)

        val visitArchUEFI = findViewById<WebView>(R.id.visit_arch_uefi)
        visitArchUEFI.loadUrl("https://space-legion.github.io/arch-uefi.html")

        val visitArchSettings = visitArchUEFI.settings
        visitArchSettings.javaScriptEnabled = true
        visitArchUEFI.webViewClient = WebViewClient()
    }
}