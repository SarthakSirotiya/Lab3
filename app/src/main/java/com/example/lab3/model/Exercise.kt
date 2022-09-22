
package com.example.lab3.model

import androidx.annotation.DrawableRes

/**
 * A data class to represent the information presented in the tree card
 */
data class Exercise(
    @DrawableRes val gifResourceId: Int, // GIF image resource ID ?
    val name: String,
    val description: String
)
