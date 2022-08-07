package com.twaun95.presentation.test

import androidx.fragment.app.Fragment
import com.twaun95.core.BaseFragment
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentTestBBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class BFragment : BaseFragment<FragmentTestBBinding, BFragmentViewModel>(R.layout.fragment_test_b) {
    companion object {
        fun newInstance() = BFragment()
    }

    override val fragmentViewModel: BFragmentViewModel by viewModel()
}