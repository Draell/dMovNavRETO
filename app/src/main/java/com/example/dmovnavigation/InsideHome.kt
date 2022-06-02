package com.example.dmovnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dmovnavigation.databinding.FragmentInsideHomeBinding


class InsideHome : Fragment() {

    private lateinit var binding: FragmentInsideHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentInsideHomeBinding.inflate(layoutInflater)

        val argumentoRecibido = arguments?.getString("argName")
        binding.textView2.setText(argumentoRecibido)

        val argumentoRecibido2 = arguments?.getString("argLast1")
        binding.textView3.setText(argumentoRecibido2)

        val argumentoRecibido3 = arguments?.getString("argLast2")
        binding.textView4.setText(argumentoRecibido3)

        val argumentoRecibido4 = arguments?.getString("argUser")
        binding.textView5.setText(argumentoRecibido4)

        val argumentoRecibido5 = arguments?.getString("argMail")
        binding.textView8.setText(argumentoRecibido5)

        return binding.root
    }
}