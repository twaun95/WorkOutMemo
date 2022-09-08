package com.twaun95.workoutmemo.data.repository

import android.util.Log
import com.twaun95.workoutmemo.data.local.dao.BodyPartDao

class MemoRepositoryImpl(
    private val dao: BodyPartDao
) : MemoRepository {
    override suspend fun getBodyPart() {
        Log.d("room", "getBodyPart: ")
    }

    override suspend fun getMemo() {
        TODO("Not yet implemented")
    }
}