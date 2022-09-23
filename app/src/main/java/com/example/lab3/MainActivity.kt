package com.example.lab3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivityMainBinding
import com.example.lab3.model.Muscle

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val FRONT: String = "FRONT"
    private val BACK: String = "BACK"
    private var rotation: String = FRONT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rotateButton.setOnClickListener {
            rotateDiagram()
        }
        binding.imageViewNeck.setOnClickListener {
            val intent = Intent(this, RecyclerActivity::class.java).apply {
                putExtra("Muscle", Muscle.TRAPS)
            }
            startActivity(intent)
        }
        binding.imageViewChest.setOnClickListener {
            if (rotation == FRONT) {
                //Go to new activity with CHEST as enum
                val intent = Intent(this, RecyclerActivity::class.java).apply {
                    putExtra("Muscle", Muscle.CHEST)
                }
                startActivity(intent)
            } else {
                //Go to new activity with Back as end
                val intent = Intent(this, RecyclerActivity::class.java).apply {
                    putExtra("Muscle", Muscle.BACK)
                }
                startActivity(intent)
            }
        }
        binding.imageViewAbs.setOnClickListener() {
            if (rotation == FRONT) {
                val intent = Intent(this, RecyclerActivity::class.java).apply {
                    putExtra("Muscle", Muscle.ABS)
                }
                startActivity(intent)
            } else {
                val intent = Intent(this, RecyclerActivity::class.java).apply {
                    putExtra("Muscle", Muscle.BACK)
                }
                startActivity(intent)
            }
        }
        binding.imageViewLeftShoulder.setOnClickListener() {
            val intent = Intent(this, RecyclerActivity::class.java).apply {
                putExtra("Muscle", Muscle.DELTS)
            }
            startActivity(intent)
        }
        binding.imageViewRightShoulder.setOnClickListener() {
            val intent = Intent(this, RecyclerActivity::class.java).apply {
                putExtra("Muscle", Muscle.DELTS)
            }
            startActivity(intent)
        }
        binding.imageViewLeftBicep.setOnClickListener() {
            if (rotation == FRONT) {
                val intent = Intent(this, RecyclerActivity::class.java).apply {
                    putExtra("Muscle", Muscle.BICEPS)
                }
                startActivity(intent)
            }
            else {
                val intent = Intent(this, RecyclerActivity::class.java).apply {
                    putExtra("Muscle", Muscle.TRICEPS)
                }
                startActivity(intent)
            }
        }
        binding.imageViewRightBicep.setOnClickListener() {
            if (rotation == FRONT) {
                val intent = Intent(this, RecyclerActivity::class.java).apply {
                    putExtra("Muscle", Muscle.BICEPS)
                }
                startActivity(intent)
            }
            else {
                val intent = Intent(this, RecyclerActivity::class.java).apply {
                    putExtra("Muscle", Muscle.TRICEPS)
                }
                startActivity(intent)
            }
        }
        binding.imageViewLeftForearm.setOnClickListener() {
            val intent = Intent(this, RecyclerActivity::class.java).apply {
                putExtra("Muscle", Muscle.FOREARMS)
            }
            startActivity(intent)
        }
        binding.imageViewRightForearm.setOnClickListener() {
            val intent = Intent(this, RecyclerActivity::class.java).apply {
                putExtra("Muscle", Muscle.FOREARMS)
            }
            startActivity(intent)
        }
        binding.imageViewLegs.setOnClickListener() {
            if (rotation == FRONT) {
                val intent = Intent(this, RecyclerActivity::class.java).apply {
                    putExtra("Muscle", Muscle.LEGS)
                }
                startActivity(intent)
            }
            else {
                val intent = Intent(this, RecyclerActivity::class.java).apply {
                    putExtra("Muscle", Muscle.LEGS)
                }
                startActivity(intent)
            }
        }
        binding.imageViewCalves.setOnClickListener() {
            val intent = Intent(this, RecyclerActivity::class.java).apply {
                putExtra("Muscle", Muscle.CALVES)
            }
            startActivity(intent)
        }
    }

    private fun rotateDiagram() {
        if (rotation == FRONT) {
            binding.imageViewNeck.setImageResource(R.drawable.mussel_man_back_traps_35)
            binding.imageViewChest.setImageResource(R.drawable.mussel_man_back_upper_back_35)
            binding.imageViewAbs.setImageResource(R.drawable.mussel_man_back_lower_back_35)
            binding.imageViewLeftShoulder.setImageResource(R.drawable.mussel_man_back_left_shoulder_35)
            binding.imageViewRightShoulder.setImageResource(R.drawable.mussel_man_back_right_shoulder_35)
            binding.imageViewLeftBicep.setImageResource(R.drawable.mussel_man_back_left_tricep_35)
            binding.imageViewRightBicep.setImageResource(R.drawable.mussel_man_back_right_tricep_35)
            binding.imageViewLeftForearm.setImageResource(R.drawable.mussel_man_back_left_forearm_35)
            binding.imageViewRightForearm.setImageResource(R.drawable.mussel_man_back_right_forearm_35)
            binding.imageViewLegs.setImageResource(R.drawable.mussel_man_back_legs_35)
            binding.imageViewCalves.setImageResource(R.drawable.mussel_man_back_calves_35)
            rotation = BACK
        } else {
            binding.imageViewNeck.setImageResource(R.drawable.mussel_man_front_neck_35)
            binding.imageViewChest.setImageResource(R.drawable.mussel_man_front_chest_35)
            binding.imageViewAbs.setImageResource(R.drawable.mussel_man_front_abs_35)
            binding.imageViewLeftShoulder.setImageResource(R.drawable.mussel_man_front_left_shoulder_35)
            binding.imageViewRightShoulder.setImageResource(R.drawable.mussel_man_front_right_shoulder_35)
            binding.imageViewLeftBicep.setImageResource(R.drawable.mussel_man_front_left_bicep_35)
            binding.imageViewRightBicep.setImageResource(R.drawable.mussel_man_front_right_bicep_35)
            binding.imageViewLeftForearm.setImageResource(R.drawable.mussel_man_front_left_forearm_35)
            binding.imageViewRightForearm.setImageResource(R.drawable.mussel_man_front_right_forearm_35)
            binding.imageViewLegs.setImageResource(R.drawable.mussel_man_front_legs_35)
            binding.imageViewCalves.setImageResource(R.drawable.mussel_man_front_calves_35)
            rotation = FRONT
        }
    }


}