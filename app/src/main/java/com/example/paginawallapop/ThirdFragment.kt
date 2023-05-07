package com.example.paginawallapop

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.navigation.fragment.navArgs


import androidx.navigation.fragment.navArgs

class ThirdFragment : Fragment(R.layout.fragment_third) {
    private val args: ThirdFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val emailText = view.findViewById<TextView>(R.id.email_text)
        emailText.text = args.email
    }
}
