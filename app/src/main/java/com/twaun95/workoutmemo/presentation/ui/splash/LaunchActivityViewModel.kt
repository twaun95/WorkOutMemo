package com.twaun95.workoutmemo.presentation.ui.splash

import com.twaun95.core.base.BaseViewModel
import com.twaun95.workoutmemo.data.local.AppSharedPreference

class LaunchActivityViewModel(
    private val sharedPreference: AppSharedPreference
) : BaseViewModel() {


    fun getLoginId() : String{
        return sharedPreference.getString(AppSharedPreference.DataKey.LOGIN_ID)
    }

    fun putLoginId(id: String) {
        sharedPreference.putString(AppSharedPreference.DataKey.LOGIN_ID, id)
    }
}