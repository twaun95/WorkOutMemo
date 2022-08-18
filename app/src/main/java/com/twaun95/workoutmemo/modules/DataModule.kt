package com.twaun95.workoutmemo.modules

import android.app.Application
import androidx.room.Room
import com.twaun95.data.TestRepository
import com.twaun95.data.local.AppSharedPreference
import com.twaun95.data.local.dao.BodyPartDao
import com.twaun95.data.local.database.AppDatabase
import com.twaun95.data.repository.BodyPartRepositoryImpl
import org.koin.android.ext.koin.androidApplication
import org.koin.core.module.Module
import org.koin.dsl.module

object DataModule : KoinModule {
    override val module: Module
        get() = module {

            single { TestRepository() }
            single { AppSharedPreference(androidApplication()) }
//            single { BodyPartRepositoryImpl(get()) }
//
//
//            single {
//                Room.databaseBuilder(
//                    get(),
//                    AppDatabase::class.java,
//                    "app_database"
//                )
//                    .fallbackToDestructiveMigration()
//                    .allowMainThreadQueries()
//                    .build()
//            }
//
//            single { get<AppDatabase>().bodyPartDao() }
        }
}