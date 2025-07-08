package com.mustafaakdas.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.mustafaakdas.navigation.databinding.FragmentFirstBinding
import com.mustafaakdas.navigation.databinding.FragmentSecondBinding
import androidx.navigation.findNavController


class SecondFragment : Fragment(R.layout.fragment_second) {

    private var SecondFragment: FragmentSecondBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentSecondBinding.bind(view)
        SecondFragment = binding
        binding.button2.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragment2ToFirstFragment3()
            it.findNavController().navigate(action)


        }
    }


}