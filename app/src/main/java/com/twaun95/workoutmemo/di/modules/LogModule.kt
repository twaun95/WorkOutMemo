package com.twaun95.workoutmemo.di.modules

import com.twaun95.workoutmemo.logger.ActivityLifeCycleLogger
import com.twaun95.workoutmemo.logger.FragmentLifeCycleLogger
import org.koin.core.module.Module
import org.koin.dsl.module

object LogModule : KoinModule {
    override val module: Module
        get() = module {
            single { FragmentLifeCycleLogger() }
            single { ActivityLifeCycleLogger(get()) }
        }
}