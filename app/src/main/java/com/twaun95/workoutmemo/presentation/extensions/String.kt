package com.twaun95.workoutmemo.presentation.extensions

import com.twaun95.workoutmemo.presentation.utils.DateConverter

fun Long.toDateFormat() : String = DateConverter.currentTimeFormat(this)