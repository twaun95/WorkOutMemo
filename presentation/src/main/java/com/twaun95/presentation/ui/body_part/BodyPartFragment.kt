package com.twaun95.presentation.ui.body_part

import com.twaun95.core.BaseFragment
import com.twaun95.data.BodyPart
import com.twaun95.data.TestRepository
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentBodyPartBinding
import com.twaun95.presentation.utils.MyLogger
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class BodyPartFragment: BaseFragment<FragmentBodyPartBinding, BodyPartFragmentViewModel>(R.layout.fragment_body_part) {
    override val fragmentViewModel: BodyPartFragmentViewModel by viewModel()

    private val testRepository by inject<TestRepository>()

    private val bodyPartAdapter by lazy { BodyPartAdapter() }
//    private val bodyPartAdapterAsync by lazy { BodyPartAdapter() }
//    private val bodyPartAdapterListAdapter by lazy { BodyPartAdapter() }


    override fun onStart() {
        super.onStart()
        bodyPartAdapter.replace(testRepository.getList())
    }

    override fun initView() {
        super.initView()
        binding.rvBodyPart.adapter = bodyPartAdapter
    }

    override fun setEvent() {
        super.setEvent()
        binding.buttonAdd.setOnClickListener {
            testRepository.addList(BodyPart(System.currentTimeMillis(), "제목"))
            bodyPartAdapter.replace(testRepository.getList())
        }
    }
}