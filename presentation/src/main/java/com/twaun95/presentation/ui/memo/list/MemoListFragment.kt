package com.twaun95.presentation.ui.memo.list

import com.twaun95.core.BaseFragment
import com.twaun95.data.TestRepository
import com.twaun95.presentation.R
import com.twaun95.presentation.adapter.BodyPartItemDecoration
import com.twaun95.presentation.databinding.FragmentMemoListBinding
import com.twaun95.presentation.extensions.setOnSingleClickListener
import com.twaun95.presentation.ui.memo.create.MemoCreateFragment
import com.twaun95.presentation.ui.memo.list.adapter.MemoAdapter
import com.twaun95.presentation.ui.memo.read.MemoFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MemoListFragment : BaseFragment<FragmentMemoListBinding, MemoListFragmentViewModel>(R.layout.fragment_memo_list) {
    override val fragmentViewModel: MemoListFragmentViewModel by viewModel()

    private val testRepository by inject<TestRepository>()
    private val memoAdapter by lazy { MemoAdapter() }

    override fun onStart() {
        super.onStart()
        memoAdapter.update(testRepository.getList())
    }

    override fun initView() {
        super.initView()

        binding.rvMemo.apply {
            addItemDecoration(BodyPartItemDecoration(requireContext()))
            adapter = memoAdapter.apply {
                moveOnClickedListener = {
                    parentFragmentManager.beginTransaction()
                        .setCustomAnimations(R.anim.slide_enter_from_right, R.anim.slide_exit_to_left, R.anim.slide_enter_from_left,R.anim.slide_exit_to_right)
                        .add(R.id.frame_layout_memo_list, MemoFragment.newInstance())
                        .addToBackStack(null)
                        .commit()
                }
            }
        }
    }

    override fun setEvent() {
        super.setEvent()
        binding.btnBack.setOnSingleClickListener {
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.slide_enter_from_left, R.anim.slide_exit_to_right)
                .remove(this)
                .commit()
        }
        binding.btnCreate.setOnSingleClickListener {
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.slide_enter_from_bottom, R.anim.slide_exit_to_top, R.anim.slide_enter_from_top,R.anim.slide_exit_to_bottom)
                .add(R.id.frame_layout_memo_list, MemoCreateFragment.newInstance())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun setObserver() {
        super.setObserver()
    }

    companion object {
        fun newInstance() = MemoListFragment()
    }
}