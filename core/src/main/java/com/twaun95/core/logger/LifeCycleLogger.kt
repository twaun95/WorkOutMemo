package com.twaun95.core.logger

import android.util.Log

object LifeCycleLogger {
    fun debug(owner: Any, message: String) {
        Log.d("TAEWAUN",
            String.format(
                "[LifeCycle][%s][%s]-%s",
                owner::class.java.simpleName,
                owner.hashCode(),
                message
            )
        )
    }
}