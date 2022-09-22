package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.databinding.ActivityMainBinding

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
            }
            else {
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
}