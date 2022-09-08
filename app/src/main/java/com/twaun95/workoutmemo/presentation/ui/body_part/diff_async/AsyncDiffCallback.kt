package com.twaun95.workoutmemo.presentation.ui.body_part.diff_async

import androidx.recyclerview.widget.DiffUtil
import com.twaun95.workoutmemo.data.BodyPart

class AsyncDiffCallback : DiffUtil.ItemCallback<BodyPart>() {
    override fun areItemsTheSame(oldItem: BodyPart, newItem: BodyPart): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: BodyPart, newItem: BodyPart): Boolean {
        return oldItem == newItem
    }
}