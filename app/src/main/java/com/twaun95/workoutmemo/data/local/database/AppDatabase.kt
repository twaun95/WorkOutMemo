package com.twaun95.workoutmemo.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.twaun95.workoutmemo.data.local.dao.BodyPartDao
import com.twaun95.workoutmemo.data.local.entity.BodyPartEntity

@Database(entities = [BodyPartEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun bodyPartDao() : BodyPartDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "user_data_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}