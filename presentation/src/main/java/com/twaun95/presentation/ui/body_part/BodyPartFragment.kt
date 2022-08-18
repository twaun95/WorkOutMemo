package com.twaun95.presentation.ui.body_part

import com.twaun95.core.BaseFragment
import com.twaun95.data.TestRepository
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentBodyPartBinding
import com.twaun95.presentation.dialog.base.BaseDialog
import com.twaun95.presentation.dialog.CommonDialog
import com.twaun95.presentation.dialog.CreateBodyPartDialog
import com.twaun95.presentation.dialog.DialogClicked
import com.twaun95.presentation.dialog.base.DialogBody
import com.twaun95.presentation.extensions.setOnSingleClickListener
import com.twaun95.presentation.ui.body_part.diff_basic.BodyPartAdapter
import com.twaun95.presentation.ui.memo.list.MemoListFragment
import com.twaun95.presentation.utils.MyLogger
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
        bodyPartAdapter.update(testRepository.getList())
    }

    override fun initView() {
        super.initView()
        binding.rvBodyPart.adapter = bodyPartAdapter.apply {
            moveOnClickedListener = {
                parentFragmentManager.beginTransaction()
                    .setCustomAnimations(R.anim.slide_enter_from_right, R.anim.slide_exit_to_left, R.anim.slide_enter_from_left,R.anim.slide_exit_to_right)
                    .add(R.id.frame_layout_main, MemoListFragment.newInstance())
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    override fun setEvent() {
        super.setEvent()
        binding.btnCreate.setOnSingleClickListener {

//            fragmentViewModel.getList()
//            CommonDialog(
//                BaseDialog.ButtonType.TWO,
//                DialogBody("제목", "내용"),
//                {
//                    MyLogger.d("No")
//                }, {
//                    MyLogger.d("Yes")
//                }
//            ).show(childFragmentManager, null)


            CreateBodyPartDialog.show(childFragmentManager) { clicked, text ->
                when (clicked) {
                    DialogClicked.NO -> {
                        MyLogger.d("No")
                    }
                    DialogClicked.YES -> {
                        MyLogger.d(text)
                    }
                }
            }
        }
    }

    companion object {
        fun newInstance() = BodyPartFragment()
    }

}