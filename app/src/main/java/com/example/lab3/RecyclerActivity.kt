package com.example.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.adapter.ExerciseCardAdapter
import com.example.lab3.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.recyclerView.adapter = ExerciseCardAdapter(applicationContext)

        binding.recyclerView.setHasFixedSize(true)

        binding.textView1.text = intent.getSerializableExtra("Muscle").toString()
    }
}