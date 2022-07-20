package com.twaun95.workoutmemo.logger

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityLifeCycleLogger(
    private val fragmentLogger: FragmentLifeCycleLogger
) : Application.ActivityLifecycleCallbacks{
    override fun onActivityCreated(p0: Activity, p1: Bundle?) {
        LifeCycleLogger.debug(p0, "Created")
        if(p0 is AppCompatActivity) {
            p0.supportFragmentManager.registerFragmentLifecycleCallbacks(fragmentLogger , true)
        }
    }

    override fun onActivityStarted(p0: Activity) {
        LifeCycleLogger.debug(p0 , "Started")
    }

    override fun onActivityResumed(p0: Activity) {
        LifeCycleLogger.debug(p0 , "Resumed")
    }

    override fun onActivityPaused(p0: Activity) {
        LifeCycleLogger.debug(p0 , "Paused")
    }

    override fun onActivityStopped(p0: Activity) {
        LifeCycleLogger.debug(p0 , "Stopped")
    }

    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
        LifeCycleLogger.debug(p0 , "SaveInstanceState")
    }

    override fun onActivityDestroyed(p0: Activity) {
        LifeCycleLogger.debug(p0 , "Destroyed")
        if(p0 is AppCompatActivity) {
            p0.supportFragmentManager.unregisterFragmentLifecycleCallbacks(fragmentLogger)
        }
    }
}