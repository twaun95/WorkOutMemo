package com.twaun95.workoutmemo.data.repository

interface MemoRepository {
    suspend fun getBodyPart()
    suspend fun getMemo()
}