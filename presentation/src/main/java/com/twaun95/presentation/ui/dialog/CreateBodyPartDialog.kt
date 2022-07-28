package com.twaun95.presentation.ui.dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.FragmentDialogCreateBodyPartBinding
import com.twaun95.presentation.utils.MyLogger
import com.twaun95.presentation.utils.setOnSingleClickListener

class CreateBodyPartDialog : DialogFragment(){

    private lateinit var binding: FragmentDialogCreateBodyPartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_TITLE, R.style.my_dialog)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDialogCreateBodyPartBinding.inflate(inflater)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCancel.setOnSingleClickListener {
            dismiss()
        }
        binding.btnComplete.setOnSingleClickListener {
            dismiss()
        }
        binding.button.setOnSingleClickListener {
            MyLogger.d("Clicked!!!!")
        }
    }

    companion object {
        fun show() {

        }
    }

    // 화면 거의 꽉차는 dialog
    // editText
    // 취소 / 추가
}