package com.yancy.jetpackapp.ui.fragment


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs

import com.yancy.jetpackapp.R

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onResume() {
        super.onResume()
        val safeArgs: HomeFragmentArgs by navArgs()
        val email = safeArgs.email
        Log.e("Yancy", "email = $email")
    }

}
