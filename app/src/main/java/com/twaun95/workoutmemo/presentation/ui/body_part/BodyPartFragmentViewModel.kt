package com.twaun95.workoutmemo.presentation.ui.body_part

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.twaun95.core.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class BodyPartFragmentViewModel() : BaseViewModel() {

    val fail by lazy { MutableLiveData<Boolean>(false) }

    init {

    }

    fun createBodyPart() {

        viewModelScope.launch(this.viewModelScope.coroutineContext + Dispatchers.IO) {
            isLoading.postValue(true)

            delay(2000L)

            fail.postValue(true)
            isLoading.postValue(false)
        }
    }

}