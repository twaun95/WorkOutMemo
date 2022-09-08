package com.twaun95.workoutmemo.presentation.test

import androidx.fragment.app.Fragment

data class Navigation(
    val name: String,
    val newInstance: (()-> Fragment),
    val radioButtonId: Int
)