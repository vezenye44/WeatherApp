package ru.geekbrains.weatherapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainBtn = findViewById<AppCompatButton>(R.id.btn_toast)
        mainBtn.setOnClickListener {
            Toast.makeText(it.context, "Button!!!", Toast.LENGTH_SHORT).show()
        }

        /** Первая заметка */
        val firstNote = Note(title = "Новая заметка", text = "Текст первой заметки")
        /** Копия первой заметки с изменененным содержанием */
        val secondNote = firstNote.copy(text = "Текст второй заметки")

        // Вывод на экран первой заметки с помощью AlertDialog
        val firstNoteBtn = findViewById<AppCompatButton>(R.id.btn_first_note)
        firstNoteBtn.setOnClickListener {
            val dialogBuilder = AlertDialog.Builder(it.context)
            dialogBuilder.setTitle(firstNote.title).setMessage(firstNote.text).show()
        }

        // Вывод на экран второй заметки
        val secondNoteBtn = findViewById<AppCompatButton>(R.id.btn_second_note)
        secondNoteBtn.setOnClickListener {
            val dialogBuilder = AlertDialog.Builder(it.context)
            dialogBuilder.setTitle(secondNote.title).setMessage(secondNote.text).show()
        }
    }
}