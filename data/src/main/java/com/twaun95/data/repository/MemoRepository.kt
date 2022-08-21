package com.twaun95.data.repository

interface MemoRepository {
    suspend fun getBodyPart()
    suspend fun getMemo()
}