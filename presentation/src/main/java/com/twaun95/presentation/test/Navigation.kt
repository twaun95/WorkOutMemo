package com.twaun95.presentation.test

import android.widget.RadioButton
import androidx.fragment.app.Fragment

data class Navigation(
    val name: String,
    val newInstance: (()-> Fragment),
    val radioButtonId: Int
)