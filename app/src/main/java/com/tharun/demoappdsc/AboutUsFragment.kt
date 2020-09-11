package com.tharun.demoappdsc

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class AboutUsFragment : Fragment() {

    private lateinit var btnLink: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about_us, container, false)

        btnLink = view.findViewById(R.id.btnLink)

        btnLink.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://dscsastra.com"))
            startActivity(intent)
        }

        return view
    }

}