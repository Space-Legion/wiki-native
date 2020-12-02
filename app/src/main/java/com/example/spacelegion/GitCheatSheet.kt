package com.example.spacelegion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class GitCheatSheet : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git_cheat_sheet)

        val goToGit = findViewById<WebView>(R.id.visit_git)
        goToGit.loadUrl("https://space-legion.github.io/git%20cheatsheet.html")

        val goToGitSettings = goToGit.settings
        goToGitSettings.javaScriptEnabled = true
        goToGit.webViewClient = WebViewClient()
    }
}