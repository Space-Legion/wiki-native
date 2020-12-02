package com.example.spacelegion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class EtcherDroid : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_etcher_droid)

        val visitEtcherDroid = findViewById<WebView>(R.id.visit_etcherdroid)
        visitEtcherDroid.loadUrl("https://github.com/EtchDroid/EtchDroid")

        val visitEtcherDroidSettings = visitEtcherDroid.settings
        visitEtcherDroidSettings.javaScriptEnabled = true
        visitEtcherDroid.webViewClient = WebViewClient()
    }
}