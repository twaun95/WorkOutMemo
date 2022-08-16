package com.twaun95.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "body_part_table")
data class BodyPartEntity(
    @ColumnInfo(name = "id") val id : Int
)