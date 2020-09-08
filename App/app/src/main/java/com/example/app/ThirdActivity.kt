package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val buttonthoat2 = findViewById(R.id.buttonthoat2) as Button
        buttonthoat2.setOnClickListener {
            //Toast.makeText(this@MainActivity,"You clicked me.", Toast.LENGTH_SHORT).show()
            val intent3: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent3)
        }
    }
}