package com.twaun95.workoutmemo.presentation.ui.memo.create

import com.twaun95.core.base.BaseFragment
import com.twaun95.workoutmemo.R
import com.twaun95.workoutmemo.databinding.FragmentMemoCreateBinding
import com.twaun95.workoutmemo.presentation.extensions.setOnSingleClickListener
import org.koin.androidx.viewmodel.ext.android.viewModel

class MemoCreateFragment : BaseFragment<FragmentMemoCreateBinding, MemoCreateFragmentViewModel>(R.layout.fragment_memo_create) {
    override val fragmentViewModel : MemoCreateFragmentViewModel by viewModel()

    override fun initView() {
        super.initView()
    }

    override fun setEvent() {
        super.setEvent()

        binding.btnBack.setOnSingleClickListener {
            // 메모 취소 완료? 다이얼로그
        }

        binding.btnCreate.setOnSingleClickListener {
            // 메모 저장
        }
    }


    companion object {
        fun newInstance() = MemoCreateFragment()
    }
}