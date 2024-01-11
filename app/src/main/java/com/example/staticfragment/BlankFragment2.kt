package com.example.staticfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment


class BlankFragment2 : Fragment() {

    private lateinit var view: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view =  inflater.inflate(R.layout.fragment_blank2, container, false)

        view.findViewById<TextView>(R.id.tv2).setOnClickListener {
            Toast.makeText(context, "Salom 2 - fragment", Toast.LENGTH_SHORT).show()
        }
        return view
    }

}