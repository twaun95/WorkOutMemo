package com.twaun95.workoutmemo.presentation.utils

import android.util.Log

object MyLogger {
    private const val TAG = "TAEWAUN"

    fun d(message: Any) { Log.d(TAG, "[Log]$message") }
}