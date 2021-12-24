package com.abdulqohar.instagramseenbyapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abdulqohar.instagramseenbyapplication.databinding.SeenByItemLayoutBinding

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>() {
    var recyclerViewList = arrayListOf<Int>()

    inner class RecyclerViewViewHolder(var binding: SeenByItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(image: Int) {
                binding.circleImageView.setImageResource(image)
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val inflater = SeenByItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecyclerViewViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        holder.bind(recyclerViewList[position])
    }

    override fun getItemCount(): Int = recyclerViewList.size

    fun submitList(list: ArrayList<Int>) {
        this.recyclerViewList = list
    }
}