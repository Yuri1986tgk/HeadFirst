package com.hfad.seckretmessage.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.hfad.seckretmessage.R

class WelcomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bStart = view.findViewById<Button>(R.id.start)
        bStart.setOnClickListener {
            val fr = getFragmentManager()?.beginTransaction()
            fr?.replace(R.id.fragment_container_view, MessageFragment())
            fr?.commit()
        }
    }
}
