package com.twaun95.presentation.utils

import android.content.Context
import android.content.res.Resources
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.ViewToastBinding
import com.twaun95.presentation.extensions.toPx

object MyToast {

    fun show(context: Context, message: String, toastDuration : Int = Toast.LENGTH_SHORT) {
        val binding: ViewToastBinding =
            DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_toast, null, false)

        binding.toastText.text = message

        Toast(context).apply {
            setGravity(Gravity.BOTTOM or Gravity.CENTER, 0, 16.toPx())
            duration = toastDuration
            view = binding.root
        }.show()
    }

}