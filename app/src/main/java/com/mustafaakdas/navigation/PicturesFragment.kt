package com.mustafaakdas.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.mustafaakdas.navigation.databinding.FragmentFirstBinding
import com.mustafaakdas.navigation.databinding.FragmentPicturesBinding

//
class PicturesFragment : Fragment(R.layout.fragment_pictures) {
    private var PicturesFragment: FragmentPicturesBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pictures, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentPicturesBinding.bind(view)
        PicturesFragment = binding
        binding.imageButton.setOnClickListener {
            val action = PicturesFragmentDirections.actionPicturesFragmentToRecourseFragment()
            it.findNavController().navigate(action)
        }
        binding.imageButton1.setOnClickListener {
            val action = PicturesFragmentDirections.actionPicturesFragmentToRecourseFragment()
            it.findNavController().navigate(action)
        }
        binding.imageButton2.setOnClickListener {
            val action = PicturesFragmentDirections.actionPicturesFragmentToRecourseFragment()
            it.findNavController().navigate(action)
        }
        binding.imageButton3.setOnClickListener {
            val action = PicturesFragmentDirections.actionPicturesFragmentToRecourseFragment()
            it.findNavController().navigate(action)
        }

    }


}