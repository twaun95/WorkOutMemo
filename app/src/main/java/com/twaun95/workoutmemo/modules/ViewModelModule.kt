package com.twaun95.workoutmemo.modules

import com.twaun95.presentation.ui.main.MainActivityViewModel
import com.twaun95.presentation.ui.body_part.BodyPartFragmentViewModel
import com.twaun95.presentation.ui.memo.list.MemoListFragmentViewModel
import com.twaun95.presentation.ui.splash.LaunchActivityViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object ViewModelModule : KoinModule{
    override val module: Module
        get() = module {
            single { LaunchActivityViewModel(get()) }
            single { MainActivityViewModel() }
            single { BodyPartFragmentViewModel() }
            single { MemoListFragmentViewModel() }
        }
}