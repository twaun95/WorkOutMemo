package com.twaun95.presentation.ui.memo.list.adapter

import androidx.recyclerview.widget.DiffUtil
import com.twaun95.data.BodyPart

class MemoDiffUtilCallback(
    private val oldList: List<BodyPart>,
    private val newList: List<BodyPart>,
) : DiffUtil.Callback(){
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }
}