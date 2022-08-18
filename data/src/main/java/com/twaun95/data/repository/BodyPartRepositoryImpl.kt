package com.twaun95.data.repository

import android.util.Log
import com.twaun95.data.local.dao.BodyPartDao
import com.twaun95.data.local.database.AppDatabase
import com.twaun95.data.local.datasource.BodyPartDataSource
import com.twaun95.data.local.entity.BodyPartEntity

class BodyPartRepositoryImpl(
    private val dao: BodyPartDao
) : BodyPartRepository {
    override suspend fun getBodyPart() {
        Log.d("room", "getBodyPart: ")
    }
}