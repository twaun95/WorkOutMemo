package com.twaun95.presentation.ui.body_part

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.twaun95.core.BaseViewModel
import com.twaun95.data.repository.BodyPartRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BodyPartFragmentViewModel(
    private val repositoryImpl: BodyPartRepositoryImpl
) : BaseViewModel() {

    val testCode = 1

    val addEvent = MutableLiveData<Boolean>(false)

    init {

    }

    fun getList() {
        viewModelScope.launch(Dispatchers.IO) {
            repositoryImpl.getBodyPart()
        }
    }
}