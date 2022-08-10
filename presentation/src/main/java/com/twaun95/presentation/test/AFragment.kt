package com.twaun95.presentation.test

import android.os.SystemClock
import androidx.fragment.app.Fragment
import com.twaun95.core.BaseFragment
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentTestABinding
import com.twaun95.presentation.utils.MyLogger
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