package com.twaun95.presentation.extensions

import com.twaun95.presentation.utils.DateConverter

fun Long.toDateFormat() : String = DateConverter.currentTimeFormat(this)