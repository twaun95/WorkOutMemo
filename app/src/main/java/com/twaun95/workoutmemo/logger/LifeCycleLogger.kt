package com.twaun95.workoutmemo.logger

import android.util.Log

object LifeCycleLogger {
    fun debug(owner: Any, message: String) {
        Log.d("taewaun",
            String.format(
                "[LifeCycle][%s][%s]-%s",
                owner::class.java.simpleName,
                owner.hashCode(),
                message
            )
        )
    }
}