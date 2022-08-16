package com.twaun95.workoutmemo.modules

import com.twaun95.presentation.test.AFragmentViewModel
import com.twaun95.presentation.test.BFragmentViewModel
import com.twaun95.presentation.test.TestActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object TestModule : KoinModule {
    override val module: Module
        get() = module {
            single { TestActivityViewModel() }
            viewModel { AFragmentViewModel() }
            viewModel { BFragmentViewModel() }
        }
}