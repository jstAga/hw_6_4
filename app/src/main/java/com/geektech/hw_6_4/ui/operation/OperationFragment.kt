package com.geektech.hw_6_4.ui.operation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.geektech.hw_6_4.MainSharedViewModel
import com.geektech.hw_6_4.databinding.FragmentOperationBinding

class OperationFragment : Fragment() {
    private lateinit var binding: FragmentOperationBinding
    private val viewModel: MainSharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOperationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnDecrement.setOnClickListener {
                viewModel.decrement()
            }
            btnIncrement.setOnClickListener {
                viewModel.increment()
            }
        }
    }
}
