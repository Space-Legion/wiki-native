package com.example.spacelegion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class VirtualboxArch : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_virtualbox_arch)

        val goTOVirtualBoxInstall = findViewById<WebView>(R.id.visit_virtual_box_install)
        goTOVirtualBoxInstall.loadUrl("https://space-legion.github.io/virtualbox-arch.html")

        val goToVirtualBoxInstallSettings = goTOVirtualBoxInstall.settings
        goToVirtualBoxInstallSettings.javaScriptEnabled = true
        goTOVirtualBoxInstall.webViewClient = WebViewClient()
    }
}