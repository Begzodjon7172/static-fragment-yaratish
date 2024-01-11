package com.example.staticfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.staticfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        val blankFragment = BlankFragment()
//
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.container, blankFragment)
//            .commit()


    }
}