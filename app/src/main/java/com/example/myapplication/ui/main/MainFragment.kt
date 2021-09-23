package com.example.myapplication.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMainBinding


class MainFragment : Fragment() {
private lateinit var mainBinding: FragmentMainBinding
private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mainBinding= FragmentMainBinding.inflate(layoutInflater)
        navController=Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)
        mainBinding.cardECode.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_e_CodeFragment)
        }
        return mainBinding.root
    }


}