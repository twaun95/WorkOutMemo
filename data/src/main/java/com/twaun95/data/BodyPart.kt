package com.twaun95.data

data class BodyPart(
    val id: Long, // 각 데이터의 고유한 id가 필요 -> db에 저장될 primary key 로 하면 될듯? -> 우선은 등록할 순간의 시간으로 대체
    val title: String
)
