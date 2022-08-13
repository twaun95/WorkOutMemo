package com.twaun95.presentation.ui.memo.read

import com.twaun95.core.BaseFragment
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentMemoBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MemoFragment : BaseFragment<FragmentMemoBinding, MemoFragmentViewModel>(R.layout.fragment_memo) {
    override val fragmentViewModel: MemoFragmentViewModel by viewModel()

    // 운동 종목 입력
    // 내용

    companion object {
        fun newInstance() = MemoFragment()
    }
}