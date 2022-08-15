package com.twaun95.presentation.ui.memo.read

import androidx.lifecycle.MutableLiveData
import com.twaun95.core.BaseViewModel

class MemoFragmentViewModel : BaseViewModel() {

    val editMode by lazy { MutableLiveData<EditMode>(EditMode.READ) }

    fun toUpdateMode() {
        editMode.value = EditMode.UPDATE
    }

    fun toReadMode() {
        editMode.value = EditMode.READ
    }

    fun update() {

    }
}