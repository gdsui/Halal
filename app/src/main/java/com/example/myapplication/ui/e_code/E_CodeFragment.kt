package com.example.myapplication.ui.e_code

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapter.ProductAdapter
import com.example.myapplication.databinding.FragmentECodeBinding
import com.example.myapplication.model.ProductModel


class E_CodeFragment : Fragment() {

    private lateinit var binding: FragmentECodeBinding
    private lateinit var adapter: ProductAdapter
    private lateinit var list: List<ProductModel>
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentECodeBinding.inflate(layoutInflater)
        navController=Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)
        initRecycler()
        Handler().postDelayed({
        },3000)
        return binding.root
    }

    private fun initRecycler() {
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
       list= ArrayList<ProductModel>()
        adapter = ProductAdapter(list)
        binding.recyclerView.adapter=adapter

    }


}