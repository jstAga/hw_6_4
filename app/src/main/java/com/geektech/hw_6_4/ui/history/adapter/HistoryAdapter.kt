package com.geektech.hw_6_4.ui.history.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.geektech.hw_6_4.databinding.ItemHistoryBinding

class HistoryAdapter : Adapter<HistoryAdapter.HistoryViewHolder>() {

    private val historyList = arrayListOf<String>()

    @SuppressLint("NotifyDataSetChanged")
    fun addData(newData: List<String>) {
        historyList.clear()
        historyList.addAll(newData.reversed())
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        return HistoryViewHolder(
            ItemHistoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.bind(historyList[position])
    }

    override fun getItemCount(): Int {
        return historyList.size
    }

    inner class HistoryViewHolder(private var binding: ItemHistoryBinding) :
        ViewHolder(binding.root) {
        fun bind(operation: String) {
            binding.tvHistory.text = operation
        }
    }
}