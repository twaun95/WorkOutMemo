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

    private val bodyPartList = mutableListOf<BodyPart>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BodyPartViewHolder {
        return BodyPartViewHolder(ItemBodyPartBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: BodyPartViewHolder, position: Int) {
        holder.bind(bodyPartList[position]) {
            moveOnClickedListener?.invoke()
        }
    }

    override fun getItemCount(): Int {
        return bodyPartList.size
    }


    fun replace(newBodyPartList: List<BodyPart>) {
        val diffCallback  = BodyPartDiffUtilCallback(bodyPartList, newBodyPartList)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        bodyPartList.clear()
        bodyPartList.addAll(newBodyPartList)

        diffResult.dispatchUpdatesTo(this)
    }

}