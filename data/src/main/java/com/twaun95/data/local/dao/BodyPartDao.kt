package com.twaun95.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.twaun95.data.local.entity.BodyPartEntity

@Dao
interface BodyPartDao{
    @Insert
    fun createBodyPart(entity: BodyPartEntity)

    @Query("SELECT * FROM body_part_table")
    fun readBodyPart() : List<BodyPartEntity>

    @Delete
    fun deleteBodyPart(entity: BodyPartEntity)
}