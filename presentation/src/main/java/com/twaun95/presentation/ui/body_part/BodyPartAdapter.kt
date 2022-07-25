package com.twaun95.presentation.ui.body_part

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.twaun95.data.BodyPart
import com.twaun95.presentation.databinding.ItemBodyPartBinding

class BodyPartAdapter(

) : RecyclerView.Adapter<BodyPartAdapter.BodyPartViewHolder>() {

    private val bodyPartList = mutableListOf<BodyPart>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BodyPartViewHolder {
        return BodyPartViewHolder(ItemBodyPartBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: BodyPartViewHolder, position: Int) {
        holder.bind(bodyPartList[position])
    }

    override fun getItemCount(): Int {
        return bodyPartList.size
    }

    class BodyPartViewHolder(
        private val binding: ItemBodyPartBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        // Todo: BaseViewHolder
        fun bind(data: BodyPart) {
            binding.textView.text = data.title
        }
    }

    fun replace(newBodyPartList: List<BodyPart>) {
        val diffCallback  = BodyPartDiffUtilCallback(bodyPartList, newBodyPartList)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        bodyPartList.clear()
        bodyPartList.addAll(newBodyPartList)

        diffResult.dispatchUpdatesTo(this)
    }

}