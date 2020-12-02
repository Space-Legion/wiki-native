package com.example.spacelegion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.nio.channels.InterruptedByTimeoutException

class Other : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val goToGitCheatSheet = findViewById<Button>(R.id.git_cheatsheet)

        goToGitCheatSheet.setOnClickListener {
            val intent = Intent(this, GitCheatSheet::class.java)
            startActivity(intent)
        }
        val goToVimGuide = findViewById<Button>(R.id.vim_guide)

        goToVimGuide.setOnClickListener {
            val intent = Intent(this, VimGuide::class.java)
            startActivity(intent)
        }
    }
}