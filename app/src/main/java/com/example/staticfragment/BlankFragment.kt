package com.example.staticfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.staticfragment.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
   
    private lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(layoutInflater)
        
        binding.tv.setOnClickListener {
            Toast.makeText(context, "Salom 1 - fragment", Toast.LENGTH_SHORT).show()
        }
        
        return binding.root
    }
    
}