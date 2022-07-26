package com.twaun95.presentation.ui.body_part.diff_async

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import com.twaun95.data.BodyPart
import com.twaun95.presentation.databinding.ItemBodyPartBinding
import com.twaun95.presentation.ui.body_part.BodyPartViewHolder

class BodyPartAsyncAdapter : RecyclerView.Adapter<BodyPartViewHolder>() {

    private val asyncDiffer = AsyncListDiffer(this, AsyncDiffCallback())

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BodyPartViewHolder {
        return BodyPartViewHolder(ItemBodyPartBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: BodyPartViewHolder, position: Int) {
        holder.bind(asyncDiffer.currentList[position])
    }

    override fun getItemCount(): Int {
        return asyncDiffer.currentList.size
    }

    fun replace(newList: List<BodyPart>) {
        asyncDiffer.submitList(newList)
    }
}