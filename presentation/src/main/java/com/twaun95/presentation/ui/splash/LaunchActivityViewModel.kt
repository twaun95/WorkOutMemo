package com.twaun95.presentation.ui.splash

import com.twaun95.core.BaseViewModel
import com.twaun95.data.local.MySharedPreference

class LaunchActivityViewModel(
    private val sharedPreference: MySharedPreference
) : BaseViewModel() {


    fun getLoginId() : String{
        return sharedPreference.getString(MySharedPreference.DataKey.LOGIN_ID)
    }

    fun putLoginId(id: String) {
        sharedPreference.putString(MySharedPreference.DataKey.LOGIN_ID, id)
    }
}