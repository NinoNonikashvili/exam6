package com.example.exam6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam6.databinding.FragmentDisplayDataBinding
import com.example.exam6.network.Content


class DisplayDataFragment : Fragment() {
    private val viewModel:DisplayViewModel by viewModels()
    private lateinit var recycler: RecyclerView
      lateinit var data: List<Content>
  private lateinit var binding: FragmentDisplayDataBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDisplayDataBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        viewModel.data.observe(viewLifecycleOwner, {
            data = it
        })
        recycler = binding.RVDisplayData
        recycler.adapter = MyAdapter(data)
        recycler.layoutManager = LinearLayoutManager(context)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}