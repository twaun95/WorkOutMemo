package com.twaun95.presentation.ui.body_part

import androidx.recyclerview.widget.RecyclerView
import com.twaun95.data.BodyPart
import com.twaun95.presentation.databinding.ItemBodyPartBinding
import com.twaun95.presentation.extensions.setOnSingleClickListener

class BodyPartViewHolder(
    private val binding: ItemBodyPartBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(
        data: BodyPart,
        onClickListener: (()->Unit)? = null
    ) {
        binding.tvTitle.text = data.title
        binding.layoutItemBodypart.setOnSingleClickListener {
            onClickListener?.invoke()
        }
    }
}