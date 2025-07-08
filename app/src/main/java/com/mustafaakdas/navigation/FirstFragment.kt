package com.mustafaakdas.navigation


import android.R.id.button1
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.mustafaakdas.navigation.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    private var firstFragment: FragmentFirstBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentFirstBinding.bind(view)
        firstFragment = binding
        binding.button1.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragment3ToSecondFragment2()
            it.findNavController().navigate(action)
        }

    }


}