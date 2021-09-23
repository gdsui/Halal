package com.example.myapplication.ui.choose

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentChooseBinding


class ChooseFragment : Fragment() {
private lateinit var mainBinding:FragmentChooseBinding
private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainBinding= FragmentChooseBinding.inflate(layoutInflater)
        return mainBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)
        mainBinding.tvLanguage.setOnClickListener {
            navController=Navigation.findNavController(requireActivity(),
                R.id.fragmentContainerView
            )
            navController.navigate(R.id.action_chooseFragment_to_chooseLanguagesFragment)
        }
        mainBinding.tvCountry.setOnClickListener {
            navController.navigate(R.id.action_chooseFragment_to_chooseCountryFragment)
        }
       mainBinding.tvNext.setOnClickListener {
           navController.navigate(R.id.action_chooseFragment_to_mainHalalActivity)
       }

    }
}