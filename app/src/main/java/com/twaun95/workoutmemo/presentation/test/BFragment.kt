package com.twaun95.workoutmemo.presentation.test

import android.os.SystemClock
import com.twaun95.core.BaseFragment
import com.twaun95.workoutmemo.R
import com.twaun95.workoutmemo.databinding.FragmentTestBBinding
import com.twaun95.workoutmemo.presentation.utils.MyLogger
import org.koin.androidx.viewmodel.ext.android.viewModel

class BFragment : BaseFragment<FragmentTestBBinding, BFragmentViewModel>(R.layout.fragment_test_b) {
    companion object {
        fun newInstance() = BFragment()
    }

    override val fragmentViewModel: BFragmentViewModel by viewModel()

    override fun onStart() {
        super.onStart()

        MyLogger.d("currentTimeMillis : ${System.currentTimeMillis()}")
        MyLogger.d("elapsedRealtime : ${SystemClock.elapsedRealtime()}")
        MyLogger.d("uptimeMillis : ${SystemClock.uptimeMillis()}")
    }
}