package com.mustafaakdas.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.mustafaakdas.navigation.databinding.FragmentRecourseBinding


class RecourseFragment : Fragment(R.layout.fragment_recourse) {
    private var RecourseFragment : FragmentRecourseBinding ?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recourse, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentRecourseBinding.bind(view)
        RecourseFragment=binding



        binding.button.setOnClickListener {
            val data= binding.editTextNumber.text.toString().toInt()
            val action= RecourseFragmentDirections.actionRecourseFragmentToPossiblePaymentPlanFragment(data)
            it.findNavController().navigate(action)
        }
    }

    }
