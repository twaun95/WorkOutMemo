package com.twaun95.workoutmemo.presentation.dialog

import com.twaun95.workoutmemo.R
import com.twaun95.workoutmemo.databinding.FragmentDialogCommonBinding
import com.twaun95.workoutmemo.presentation.dialog.base.BaseDialog
import com.twaun95.workoutmemo.presentation.dialog.base.DialogBody
import com.twaun95.workoutmemo.presentation.extensions.setOnSingleClickListener
import com.twaun95.workoutmemo.presentation.extensions.visible

class CommonDialog(
    private val buttonType: ButtonType,
    private val content: DialogBody,
    private var onCancelListener : (()->Unit)? = null,
    private var onConfirmListener : (()->Unit)? = null
) : BaseDialog<FragmentDialogCommonBinding>(R.layout.fragment_dialog_common){

    override fun initView() {
        super.initView()

        when(buttonType) {
            ButtonType.ONE -> {
                binding.layoutBottomTypeOne.visible()
            }
            ButtonType.TWO -> {
                binding.layoutBottomTypeTwo.visible()
            }
        }

        content.run {
            binding.tvTitle.text = title
            binding.tvMessage.text = message ?: ""
        }
    }

    override fun setEvent() {
        super.setEvent()

        binding.btnCancelTypeTwo.setOnSingleClickListener {
            onCancelListener?.invoke()
            dismiss()
        }
        binding.btnCompleteTypeTwo.setOnSingleClickListener {
            onConfirmListener?.invoke()
            dismiss()
        }
        binding.btnCompleteTypeOne.setOnSingleClickListener {
            onConfirmListener?.invoke()
            dismiss()
        }
    }
}