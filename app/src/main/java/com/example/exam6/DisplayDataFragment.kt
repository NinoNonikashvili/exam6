package com.example.exam6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.exam6.databinding.FragmentDisplayDataBinding


class DisplayDataFragment : Fragment() {
  private lateinit var binding: FragmentDisplayDataBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDisplayDataBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }


}