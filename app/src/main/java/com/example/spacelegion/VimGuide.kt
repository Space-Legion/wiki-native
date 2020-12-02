package com.example.spacelegion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class VimGuide : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vim_guide)

        val goToVimGuide = findViewById<WebView>(R.id.visit_vim_guide)
        goToVimGuide.loadUrl("https://space-legion.github.io/vimguide.html")

        val goToVimGuideSettings = goToVimGuide.settings
        goToVimGuideSettings.javaScriptEnabled = true
        goToVimGuide.webViewClient = WebViewClient()
    }
}