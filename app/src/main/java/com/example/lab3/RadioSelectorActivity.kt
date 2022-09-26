package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.databinding.ActivityRadioSelectorBinding
import com.example.lab3.model.Muscle

class RadioSelectorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRadioSelectorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadioSelectorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setTitle("Select a muscle group!")

        binding.buttonGo.setOnClickListener {
            val intent = Intent(this, RecyclerActivity::class.java)
            when (binding.radioGroup.checkedRadioButtonId) {
                binding.radioTraps.id -> intent.putExtra("Muscle", Muscle.TRAPS)
                binding.radioChest.id -> intent.putExtra("Muscle", Muscle.CHEST)
                binding.radioBack.id -> intent.putExtra("Muscle", Muscle.BACK)
                binding.radioDelts.id -> intent.putExtra("Muscle", Muscle.DELTS)
                binding.radioBiceps.id -> intent.putExtra("Muscle", Muscle.BICEPS)
                binding.radioTriceps.id -> intent.putExtra("Muscle", Muscle.TRICEPS)
                binding.radioForearms.id -> intent.putExtra("Muscle", Muscle.FOREARMS)
                binding.radioAbs.id -> intent.putExtra("Muscle", Muscle.ABS)
                binding.radioLegs.id -> intent.putExtra("Muscle", Muscle.LEGS)
                binding.radioCalves.id -> intent.putExtra("Muscle", Muscle.CALVES)
            }
            startActivity(intent)
        }
    }
}