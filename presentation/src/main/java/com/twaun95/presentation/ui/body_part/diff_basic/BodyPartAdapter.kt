package com.twaun95.presentation.ui.body_part.diff_basic

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.twaun95.data.BodyPart
import com.twaun95.presentation.databinding.ItemBodyPartBinding
import com.twaun95.presentation.ui.body_part.BodyPartViewHolder

class BodyPartAdapter(
    var moveOnClickedListener: (()->Unit)? = null
) : RecyclerView.Adapter<BodyPartViewHolder>() {

    private val itemList = mutableListOf<BodyPart>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BodyPartViewHolder {
        return BodyPartViewHolder(ItemBodyPartBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: BodyPartViewHolder, position: Int) {
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

}