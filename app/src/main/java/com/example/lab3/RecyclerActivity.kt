package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.example.lab3.model.Muscle

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val textView = findViewById<TextView>(R.id.textView_1)
        textView.text = intent.getSerializableExtra("Muscle").toString()
    }
}