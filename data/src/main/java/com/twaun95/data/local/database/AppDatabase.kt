package com.twaun95.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.twaun95.data.local.dao.BodyPartDao
import com.twaun95.data.local.entity.BodyPartEntity

@Database(entities = [BodyPartEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun bodyPartDao() : BodyPartDao
}