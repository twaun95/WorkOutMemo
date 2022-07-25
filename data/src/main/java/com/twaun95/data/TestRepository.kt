package com.twaun95.data

class TestRepository {

    private val bodyPartList = mutableListOf<BodyPart>()

    fun addList(newData : BodyPart) {
        bodyPartList.add(newData)
    }

    fun getList() : List<BodyPart>{
        return bodyPartList
    }
}