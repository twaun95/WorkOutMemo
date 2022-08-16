package com.twaun95.data.local.datasource

import com.twaun95.data.local.dao.BodyPartDao

class BodyPartLocalDataSourceImpl(
    private val bodyPartDao: BodyPartDao
) : BodyPartDataSource{

    override fun getBodyPart() {

    }
}