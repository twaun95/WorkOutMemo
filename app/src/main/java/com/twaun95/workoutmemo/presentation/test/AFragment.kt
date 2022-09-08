package com.twaun95.workoutmemo.presentation.test

import android.os.SystemClock
import com.twaun95.core.BaseFragment
import com.twaun95.workoutmemo.R
import com.twaun95.workoutmemo.databinding.FragmentTestABinding
import com.twaun95.workoutmemo.presentation.utils.MyLogger
import org.koin.androidx.viewmodel.ext.android.viewModel

class AFragment : BaseFragment<FragmentTestABinding, AFragmentViewModel>(R.layout.fragment_test_a){
    companion object {
        fun newInstance() = AFragment()
    }

    override val fragmentViewModel: AFragmentViewModel by viewModel()

    override fun onStart() {
        super.onStart()

        MyLogger.d("currentTimeMillis : ${System.currentTimeMillis()}")
        MyLogger.d("elapsedRealtime : ${SystemClock.elapsedRealtime()}")
        MyLogger.d("uptimeMillis : ${SystemClock.uptimeMillis()}")
    }

}