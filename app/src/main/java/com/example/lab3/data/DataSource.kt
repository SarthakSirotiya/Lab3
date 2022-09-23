/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.lab3.data

import com.example.lab3.R
import com.example.lab3.model.Exercise
import com.example.lab3.model.Muscle
import com.example.lab3.model.Muscle_Exercises

/**
 * An object to generate a static list of dogs
 */
object DataSource {

//    val trap_exercises = Muscle_Exercises (
//        listOf(
//            Exercise ()
//        ),
//        Muscle.TRAPS
//    )

    val chest_exercises = Muscle_Exercises (
        listOf(
            Exercise (
                R.drawable.incline_dumbell_press,
                "Incline Dumbell Press",
                "Targets Clavicular Head (Upper Chest)"
            ),
            Exercise (
                R.drawable.barbell_bench_press,
                "Barbell Bench Press",
                "Targets Sternal Head (Mid Chest)"
            ),
            Exercise (
                R.drawable.dips,
                "Dips",
                "Targets Sternal Head (Lower Chest)"
            )
        ),
        Muscle.CHEST
    )

    val delt_exercises = Muscle_Exercises (
        listOf(
            Exercise (
                R.drawable.shoulder_standing_overhead_press,
                "Standing Overhead Press",
                "Targets Anterior Deltoid"
            ),
            Exercise (
                R.drawable.shoulder_dumbbell_lateral_raise,
                "Dumbell Lateral Raise",
                "Targets Lateral Deltoid"
            ),
            Exercise (
                R.drawable.shoulder_supine_face_pulls,
                "Supine Face Pulls",
                "Targets Posterior Deltoid"
            )
        ),
        Muscle.DELTS
    )

    val bicep_exercises = Muscle_Exercises (
        listOf(
            Exercise (
                R.drawable.bicep_incline_dumbell_curl,
                "Incline Dumbell Curl",
                "Targets Long Head"
            ),
            Exercise (
                R.drawable.bicep_concentration_curl,
                "Concentration Curl",
                "Targets Short Head"
            ),
            Exercise (
                R.drawable.bicep_reverse_ez_bar_curl,
                "Reverse Curl",
                "Targets Brachialis"
            ),
            Exercise (
                R.drawable.bicep_chin_up,
                "Chin-Up",
                "Targets Type II Muscles"
            )
        ),
        Muscle.BICEPS
    )

    val tricep_exercises = Muscle_Exercises (
        listOf(
            Exercise (
                R.drawable.tricep_incline_dumbell_kickback,
                "Incline Dumbell Kickback",
                "Targets Long Head"
            ),
            Exercise (
                R.drawable.tricep_incline_dumbell_overhead_extension,
                "Incline Dumbell Overhead Extension",
                "Targets Long Head"
            ),
            Exercise (
                R.drawable.tricep_bar_pushdown,
                "Bar Pushdown",
                "Targets Lateral Head"
            )
        ),
        Muscle.TRICEPS
    )

    val forearm_exercises = Muscle_Exercises (
        listOf(
            Exercise (
                R.drawable.forearm_standing_wrist_curls,
                "Standing Wrist Curl",
                "Targets Flexors"
            ),
            Exercise (
                R.drawable.forearm_standing_wrist_extensions,
                "Standing Wrist Extension",
                "Targets Extensors"
            ),
            Exercise (
                R.drawable.forearm_wrist_rollers,
                "Wrist Rollers",
                "Targets Metabolic Stress"
            )
        ),
        Muscle.FOREARMS
    )

//    val ab_exercises = Muscle_Exercises (
//        listOf(
//            Exercise ()
//        ),
//        Muscle.ABS
//    )

    val leg_exercises = Muscle_Exercises (
        listOf(
            Exercise (
                R.drawable.legs_barbell_squat,
                "Barbell Squat",
                "Targets Quads"
            ),
            Exercise (
                R.drawable.legs_romanian_deadlift,
                "Romanian Deadlift",
                "Targets Glutes n' Hams"
            ),
            Exercise (
                R.drawable.legs_bulgarian_split_squat,
                "Bulgarian Split Squat",
                "Targets Quads, Glutes, n' Hams"
            )
        ),
        Muscle.LEGS
    )

//    val calf_exercises = Muscle_Exercises (
//        listOf(
//            Exercise ()
//        ),
//        Muscle.CALVES
//    )

}
