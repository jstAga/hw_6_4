package com.geektech.hw_6_4.ui.history

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.geektech.hw_6_4.MainSharedViewModel
import com.geektech.hw_6_4.databinding.FragmentHistoryBinding
import com.geektech.hw_6_4.ui.history.adapter.HistoryAdapter

class HistoryFragment : Fragment() {

    private lateinit var binding: FragmentHistoryBinding
    private lateinit var viewModel: MainSharedViewModel
    private val adapter by lazy {
        HistoryAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewModel()
        initAdapter()
        initObserver()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainSharedViewModel::class.java]
    }

    private fun initAdapter() {
        binding.rvHistory.adapter = adapter
    }

    private fun initObserver() {
        viewModel.history.observe(viewLifecycleOwner) {
            adapter.addData(it.split(" "))
        }
    }
}