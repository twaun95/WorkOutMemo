package com.twaun95.presentation.test

import androidx.fragment.app.Fragment
import com.twaun95.core.BaseFragment
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentTestABinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class AFragment : BaseFragment<FragmentTestABinding, AFragmentViewModel>(R.layout.fragment_test_a){
    companion object {
        fun newInstance() = AFragment()
    }

    override val fragmentViewModel: AFragmentViewModel by viewModel()


}