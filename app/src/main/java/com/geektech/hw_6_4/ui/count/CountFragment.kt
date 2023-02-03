package com.geektech.hw_6_4.ui.count

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.geektech.hw_6_4.MainSharedViewModel
import com.geektech.hw_6_4.databinding.FragmentCountBinding


class CountFragment : Fragment() {

    private lateinit var binding: FragmentCountBinding
    private lateinit var viewModel: MainSharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewModel()
        initObserver()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainSharedViewModel::class.java]
    }

    private fun initObserver() {
       viewModel.count.observe(viewLifecycleOwner){
           binding.tvCount.text = it.toString()
       }
    }
}