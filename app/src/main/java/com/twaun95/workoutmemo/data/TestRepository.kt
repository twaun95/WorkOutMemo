package com.twaun95.workoutmemo.data

class TestRepository {

    private val bodyPartList = mutableListOf<BodyPart>(
        BodyPart(-2, "어깨"),
        BodyPart(-1, "등")
    )
    private var id = 0

    fun addList() {
        id = id.plus(1)
        bodyPartList.add(BodyPart(id, "$id"))
    }

    fun getList() : MutableList<BodyPart>{
        return bodyPartList
    }
}