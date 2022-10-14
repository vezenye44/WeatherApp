package ru.geekbrains.weatherapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainBtn = findViewById<AppCompatButton>(R.id.btn)
        mainBtn.setOnClickListener {
            Toast.makeText(it.context, "Button!!!", Toast.LENGTH_SHORT).show()
        }
    }
}