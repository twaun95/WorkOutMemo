package com.twaun95.workoutmemo.modules

import com.twaun95.presentation.ui.MainActivityViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object ViewModelModule : KoinModule{
    override val module: Module
        get() = module {
            single { MainActivityViewModel() }
        }
}