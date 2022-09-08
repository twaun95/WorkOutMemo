package com.twaun95.workoutmemo.presentation.ui.body_part.diff_listadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.twaun95.workoutmemo.data.BodyPart
import com.twaun95.workoutmemo.databinding.ItemBodyPartBinding
import com.twaun95.workoutmemo.presentation.ui.body_part.BodyPartViewHolder

class BodyPartListAdapter : ListAdapter<BodyPart, BodyPartViewHolder>(diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BodyPartViewHolder {
        return BodyPartViewHolder(ItemBodyPartBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: BodyPartViewHolder, position: Int) {
        return holder.bind(getItem(position))
    }

    fun replace(newList: List<BodyPart>) {
        submitList(newList)
    }

    companion object {
        val diffUtil = object: DiffUtil.ItemCallback<BodyPart>() {
            override fun areContentsTheSame(oldItem: BodyPart, newItem: BodyPart): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: BodyPart, newItem: BodyPart): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }
}