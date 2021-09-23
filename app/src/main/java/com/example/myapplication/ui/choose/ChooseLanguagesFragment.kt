package com.example.myapplication.ui.choose

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.myapplication.databinding.FragmentChooseLanguagesBinding


class ChooseLanguagesFragment : Fragment() {

private lateinit var chooseLanguagesBinding: FragmentChooseLanguagesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        chooseLanguagesBinding= FragmentChooseLanguagesBinding.inflate(layoutInflater)
        return chooseLanguagesBinding.root
        val radioGroup=RadioGroup(requireContext())
        radioGroup.showDividers
        radioGroup.dividerDrawable
    }

}