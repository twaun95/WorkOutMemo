package com.twaun95.workoutmemo.presentation.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.twaun95.workoutmemo.R
import com.twaun95.workoutmemo.databinding.FragmentDialogCreateBodyPartBinding
import com.twaun95.workoutmemo.presentation.extensions.setOnSingleClickListener

class CreateBodyPartDialog(private var dialogClickListener : ((clicked: DialogClicked, text: String)->Unit)? = null) : DialogFragment(){

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
            dialogClickListener?.invoke(DialogClicked.NO, binding.etvBodyPart.text.toString())
            dismiss()
        }
        binding.btnComplete.setOnSingleClickListener {
            dialogClickListener?.invoke(DialogClicked.YES, binding.etvBodyPart.text.toString())
            dismiss()
        }
    }

    companion object {
        fun show(fragmentManager: FragmentManager, clickListener: ((clicked: DialogClicked, text: String)->Unit)? = null) {
            return CreateBodyPartDialog(clickListener).show(fragmentManager, null)
        }
    }
}