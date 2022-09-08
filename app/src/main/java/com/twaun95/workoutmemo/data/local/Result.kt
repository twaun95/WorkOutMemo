package com.twaun95.workoutmemo.data.local

import com.twaun95.workoutmemo.data.local.entity.BodyPartEntity

// useCase
sealed class Result {
    data class OnSuccess(val memes: List<BodyPartEntity>) : Result()
    object OnError : Result()
}