package com.twaun95.presentation.ui.body_part

import com.twaun95.core.BaseFragment
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentBodyPartBinding
import com.twaun95.presentation.utils.MyLogger
import org.koin.androidx.viewmodel.ext.android.viewModel

class BodyPartFragment: BaseFragment<FragmentBodyPartBinding, BodyPartFragmentViewModel>(R.layout.fragment_body_part) {
    override val fragmentViewModel: BodyPartFragmentViewModel by viewModel()

    override fun initView() {
        super.initView()
        MyLogger.d(fragmentViewModel.testCode)
    }
}