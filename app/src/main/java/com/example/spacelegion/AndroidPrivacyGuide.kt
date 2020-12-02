package com.example.spacelegion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class AndroidPrivacyGuide : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_privacy_guide)

        val goToAndroidPrivacy = findViewById<WebView>(R.id.visit_privacy_guide)
        goToAndroidPrivacy.loadUrl("https://github.com/nebulaxyz/android-privacy-guide-2020")

        val goToAndroidPrivacySettings = goToAndroidPrivacy.settings
        goToAndroidPrivacySettings.javaScriptEnabled = true
        goToAndroidPrivacy.webViewClient = WebViewClient()
    }
}