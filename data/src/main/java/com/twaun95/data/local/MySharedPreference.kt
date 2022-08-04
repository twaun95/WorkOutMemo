package com.twaun95.data.local

import android.content.Context
import androidx.core.content.edit

class MySharedPreference(context: Context) {

    private val preference = context.getSharedPreferences(FILE_KEY, Context.MODE_PRIVATE)


    fun putString(key: DataKey, value: String) {
        preference.edit { putString(key.keyToString, value) }
    }

    fun putBoolean(key: DataKey, value: Boolean) {
        preference.edit { putBoolean(key.keyToString, value)}
    }

    fun getString(key: DataKey) : String {
        return preference.getString(key.keyToString, null) ?: ""
    }

    fun getBoolean(key: DataKey) : Boolean {
        return preference.getBoolean(key.keyToString, false)
    }

    companion object {
        private const val FILE_KEY = "SHARED_PREFERENCES_KEY"


    }

    enum class DataKey(val keyToString: String) {
        LOGIN_ID("LOGIN_ID"),
        IS_AUTO_LOGIN("IS_AUTO_LOGIN"),
    }

}