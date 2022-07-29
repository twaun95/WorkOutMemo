package com.twaun95.presentation.ui.body_part

import android.os.Bundle
import android.view.View
import com.twaun95.core.BaseFragment
import com.twaun95.data.BodyPart
import com.twaun95.data.TestRepository
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentBodyPartBinding
import com.twaun95.presentation.extensions.setOnSingleClickListener
import com.twaun95.presentation.ui.body_part.diff_async.BodyPartAsyncAdapter
import com.twaun95.presentation.ui.body_part.diff_basic.BodyPartAdapter
import com.twaun95.presentation.ui.body_part.diff_listadapter.BodyPartListAdapter
import com.twaun95.presentation.ui.dialog.CreateBodyPartDialog
import com.twaun95.presentation.ui.memo.list.MemoListFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class BodyPartFragment: BaseFragment<FragmentBodyPartBinding, BodyPartFragmentViewModel>(R.layout.fragment_body_part) {
    override val fragmentViewModel: BodyPartFragmentViewModel by viewModel()

    private val testRepository by inject<TestRepository>()

    private val bodyPartAdapter by lazy { BodyPartAdapter() }
//    private val bodyPartAdapter by lazy { BodyPartAsyncAdapter() }
//    private val bodyPartAdapter by lazy { BodyPartListAdapter() }

    override fun onStart() {
        super.onStart()
        bodyPartAdapter.replace(testRepository.getList())
    }

    override fun initView() {
        super.initView()
        binding.rvBodyPart.adapter = bodyPartAdapter.apply {
            moveOnClickedListener = {
                parentFragmentManager.beginTransaction().add(R.id.frame_layout_main, MemoListFragment()).addToBackStack(null).commit()
            }
        }
    }

    override fun setEvent() {
        super.setEvent()
        binding.buttonAdd.setOnSingleClickListener {
            CreateBodyPartDialog().show(childFragmentManager, null)
//            testRepository.addList()
//            bodyPartAdapter.replace(testRepository.getList())
        }
    }

    override fun setObserver() {
        super.setObserver()
    }
}