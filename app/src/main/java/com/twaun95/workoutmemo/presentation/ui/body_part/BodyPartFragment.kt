package com.twaun95.workoutmemo.presentation.ui.body_part

import com.twaun95.core.BaseFragment
import com.twaun95.workoutmemo.data.TestRepository
import com.twaun95.presentation.R
import com.twaun95.workoutmemo.presentation.adapter.BodyPartItemDecoration
import com.twaun95.presentation.databinding.FragmentBodyPartBinding
import com.twaun95.workoutmemo.presentation.dialog.base.BaseDialog
import com.twaun95.workoutmemo.presentation.dialog.CommonDialog
import com.twaun95.workoutmemo.presentation.dialog.CreateBodyPartDialog
import com.twaun95.workoutmemo.presentation.dialog.DialogClicked
import com.twaun95.workoutmemo.presentation.dialog.base.DialogBody
import com.twaun95.workoutmemo.presentation.extensions.setOnSingleClickListener
import com.twaun95.workoutmemo.presentation.ui.body_part.diff_basic.BodyPartAdapter
import com.twaun95.workoutmemo.presentation.ui.memo.list.MemoListFragment
import com.twaun95.workoutmemo.presentation.utils.MyLogger
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

        binding.viewModel = fragmentViewModel

        binding.rvBodyPart.apply {
            addItemDecoration(BodyPartItemDecoration(requireContext()))
            adapter = bodyPartAdapter.apply {
                moveOnClickedListener = {
                    parentFragmentManager.beginTransaction()
                        .setCustomAnimations(R.anim.slide_enter_from_right, R.anim.slide_exit_to_left, R.anim.slide_enter_from_left,R.anim.slide_exit_to_right)
                        .add(R.id.frame_layout_main, MemoListFragment.newInstance())
                        .addToBackStack(null)
                        .commit()
                }
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
                        fragmentViewModel.createBodyPart()
                    }
                }
            }
        }
    }

    override fun setObserver() {
        super.setObserver()

        fragmentViewModel.fail.observe(viewLifecycleOwner) {
            if (!it) return@observe

            CommonDialog(
                BaseDialog.ButtonType.TWO,
                DialogBody("추가 완료", "추가가 완료되었습니다."),
                {
                    MyLogger.d("No")
                }, {
                    MyLogger.d("Yes")
                }
            ).show(childFragmentManager, null)
        }
    }

    companion object {
        fun newInstance() = BodyPartFragment()
    }

}