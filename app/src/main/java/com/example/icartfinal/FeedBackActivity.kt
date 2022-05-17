package com.example.icartfinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FeedBackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        val btnIntroText = findViewById<EditText>(R.id.editTextTextMultiLine)
        val btnSubmit = findViewById<Button>(R.id.submit_Feedback)

        btnIntroText.setOnClickListener { btnIntroText.text = btnIntroText.text }

        btnSubmit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            Toast.makeText(this, "Submit Sent :D", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}