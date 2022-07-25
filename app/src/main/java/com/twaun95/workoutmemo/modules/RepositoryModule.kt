package com.twaun95.workoutmemo.modules

import com.twaun95.data.TestRepository
import org.koin.core.module.Module
import org.koin.dsl.module

object RepositoryModule : KoinModule {
    override val module: Module
        get() = module {
            single { TestRepository() }
        }
}