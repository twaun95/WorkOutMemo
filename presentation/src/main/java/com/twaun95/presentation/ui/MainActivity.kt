package com.twaun95.presentation.ui

import android.widget.Toast
import com.twaun95.core.BaseActivity
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.ActivityMainBinding
import com.twaun95.presentation.utils.MyLogger
import com.twaun95.presentation.utils.MyToast
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>(R.layout.activity_main) {
    override val viewModel : MainActivityViewModel by viewModel()

    override fun onStart() {
        super.onStart()
        MyLogger.d(viewModel.code)
        MyToast.show(this, "토스트 실험", Toast.LENGTH_LONG)
    }

}