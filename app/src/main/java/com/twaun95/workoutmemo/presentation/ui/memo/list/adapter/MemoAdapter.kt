package com.twaun95.workoutmemo.presentation.ui.memo.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.twaun95.workoutmemo.data.BodyPart
import com.twaun95.workoutmemo.databinding.ItemMemoBinding
import com.twaun95.workoutmemo.presentation.extensions.setOnSingleClickListener
import com.twaun95.workoutmemo.presentation.extensions.toDateFormat
import com.twaun95.workoutmemo.presentation.ui.body_part.diff_basic.BodyPartDiffUtilCallback

class MemoAdapter(
    var moveOnClickedListener: (()->Unit)? = null
) : RecyclerView.Adapter<MemoAdapter.MemoViewHolder>(){

    private val itemList = mutableListOf<BodyPart>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemoViewHolder {
        return MemoViewHolder(ItemMemoBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: MemoViewHolder, position: Int) {
        holder.bind(itemList[position]) {
            moveOnClickedListener?.invoke()
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    fun update(newItemList: List<BodyPart>) {
        val diffCallback  = BodyPartDiffUtilCallback(itemList, newItemList)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        itemList.clear()
        itemList.addAll(newItemList)

        diffResult.dispatchUpdatesTo(this)
    }



    inner class MemoViewHolder(
        private val binding: ItemMemoBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(
            data: BodyPart,
            onClickListener: (()->Unit)? = null
        ) {
            binding.tvTitle.text = data.title
            binding.tvDate.text = System.currentTimeMillis().toDateFormat()
            binding.layoutItemMemo.setOnSingleClickListener {
                onClickListener?.invoke()
            }
        }
    }
}