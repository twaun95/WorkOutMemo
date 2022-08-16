package com.twaun95.presentation.ui.splash

import com.twaun95.core.BaseViewModel
import com.twaun95.data.local.AppSharedPreference

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