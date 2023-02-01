package com.geektech.hw_6_4.ui.count

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.geektech.hw_6_4.MainSharedViewModel
import com.geektech.hw_6_4.databinding.FragmentCountBinding


class CountFragment : Fragment() {

    private lateinit var binding: FragmentCountBinding
    private val viewModel : MainSharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initObserver()
    }

    private fun initObserver() {
       viewModel.count.observe(viewLifecycleOwner){
           binding.tvCount.text = it.toString()
       }
    }
}