package com.twaun95.workoutmemo

import android.app.Application
import com.twaun95.workoutmemo.logger.ActivityLifeCycleLogger
import com.twaun95.workoutmemo.modules.LogModule
import com.twaun95.workoutmemo.modules.ViewModelModule
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application(){

    private val activityLifeCycleLogger by inject<ActivityLifeCycleLogger>()

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                LogModule.module,
                ViewModelModule.module
            )
        }
        registerActivityLifecycleCallbacks(activityLifeCycleLogger)
    }
}