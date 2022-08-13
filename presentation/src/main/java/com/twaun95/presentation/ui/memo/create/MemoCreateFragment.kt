package com.twaun95.presentation.ui.memo.create

import com.twaun95.core.BaseFragment
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentMemoCreateBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MemoCreateFragment : BaseFragment<FragmentMemoCreateBinding, MemoCreateFragmentViewModel>(R.layout.fragment_memo_create) {
    override val fragmentViewModel : MemoCreateFragmentViewModel by viewModel()


    companion object {
        fun newInstance() = MemoCreateFragment()
    }
}