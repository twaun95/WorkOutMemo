package com.twaun95.workoutmemo.presentation.utils

import android.annotation.SuppressLint
import java.text.SimpleDateFormat

object DateConverter {
    fun dateStringFormatFromServer(value: String) : String{
        return "${value.substring(0,4)}.${value.substring(4,6)}.${value.substring(6,8)}"
    }

    @SuppressLint("SimpleDateFormat")
    fun currentTimeFormat(time: Long) : String {
        return SimpleDateFormat("yyyy.MM.dd").format(time)
    }
}