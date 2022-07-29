package com.twaun95.presentation.ui.memo.list

import com.twaun95.core.BaseFragment
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentMemoListBinding
import com.twaun95.presentation.extensions.setOnSingleClickListener
import org.koin.androidx.viewmodel.ext.android.viewModel

class MemoListFragment : BaseFragment<FragmentMemoListBinding, MemoListFragmentViewModel>(R.layout.fragment_memo_list) {
    override val fragmentViewModel: MemoListFragmentViewModel by viewModel()

    override fun initView() {
        super.initView()
    }

    override fun setEvent() {
        super.setEvent()
        binding.btnBack.setOnSingleClickListener {
            parentFragmentManager.beginTransaction().remove(this).commit()
        }
        binding.btnCreate.setOnSingleClickListener {
            // 메모추가 fragment
        }
    }

    override fun setObserver() {
        super.setObserver()
    }
}