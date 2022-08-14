package com.twaun95.data.local

import androidx.room.*
import com.twaun95.data.BodyPart

@Entity
data class BodyPart(
    @ColumnInfo(name = "id") val id : Int
)

@Dao
interface BodyPartDao{
    @Insert
    fun insertBodyPart(bodyPart: BodyPart)


}

@Database(entities = [com.twaun95.data.local.BodyPart::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun bodyPartDao() : BodyPartDao
}
