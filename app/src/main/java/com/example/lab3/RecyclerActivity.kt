package com.example.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.adapter.ExerciseCardAdapter
import com.example.lab3.data.DataSource
import com.example.lab3.databinding.ActivityRecyclerBinding
import com.example.lab3.model.Muscle
import com.example.lab3.model.Muscle_Exercises

class RecyclerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTitle("Perform carefully!")
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.recyclerView.adapter = ExerciseCardAdapter(
            applicationContext,
            determine_exercises(intent.getSerializableExtra("Muscle") as Muscle)
        )

        // Specify fixed size to improve performance
        binding.recyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    fun determine_exercises(my_muscle: Muscle): Muscle_Exercises {

        var my_list = when (my_muscle) {
            Muscle.TRAPS -> DataSource.trap_exercises
            Muscle.CHEST -> DataSource.chest_exercises
            Muscle.BACK -> DataSource.back_exercises
            Muscle.DELTS -> DataSource.delt_exercises
            Muscle.BICEPS -> DataSource.bicep_exercises
            Muscle.TRICEPS -> DataSource.tricep_exercises
            Muscle.FOREARMS -> DataSource.forearm_exercises
            Muscle.ABS -> DataSource.ab_exercises
            Muscle.LEGS -> DataSource.leg_exercises
            Muscle.CALVES -> DataSource.calf_exercises

            else -> {DataSource.chest_exercises}
        }

        return my_list
    }
}