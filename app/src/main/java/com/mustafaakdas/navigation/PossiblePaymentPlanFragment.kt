package com.mustafaakdas.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.mustafaakdas.navigation.databinding.FragmentPicturesBinding
import com.mustafaakdas.navigation.databinding.FragmentPossiblePaymentPlanBinding
import kotlin.getValue

class PossiblePaymentPlanFragment : Fragment(R.layout.fragment_possible_payment_plan) {

    private var PossiblePaymentPlanFragment: FragmentPossiblePaymentPlanBinding? = null
    val args : PossiblePaymentPlanFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_possible_payment_plan, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentPossiblePaymentPlanBinding.bind(view)
        binding.textView6.text=args.sayi.toString()
        PossiblePaymentPlanFragment = binding


    }

}