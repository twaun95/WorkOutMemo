package com.twaun95.presentation.ui.memo.read

import com.twaun95.core.BaseFragment
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentMemoBinding
import com.twaun95.presentation.extensions.setOnSingleClickListener
import org.koin.androidx.viewmodel.ext.android.viewModel

class MemoFragment : BaseFragment<FragmentMemoBinding, MemoFragmentViewModel>(R.layout.fragment_memo) {
    override val fragmentViewModel: MemoFragmentViewModel by viewModel()

    // 운동 종목 입력
    // 내용

    override fun initView() {
        super.initView()

        binding.viewModel = fragmentViewModel
    }

    override fun setEvent() {
        super.setEvent()

        binding.btnBack.setOnSingleClickListener {
            // 메모 취소 완료? 다이얼로그
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.slide_enter_from_left, R.anim.slide_exit_to_right)
                .remove(this)
                .commit()
        }

        binding.btnUpdate.setOnSingleClickListener {
            // 메모 저장
        }
    }

    companion object {
        fun newInstance() = MemoFragment()
    }
}