package com.hfad.seckretmessage.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import com.hfad.seckretmessage.R

class MessageFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val nextButton = view.findViewById<Button>(R.id.next)
        val editText = view.findViewById<EditText>(R.id.edit_text)
        val bundle = Bundle()


        nextButton.setOnClickListener {
            val message = editText.text.toString()

            bundle.putString("key", message)
            view.findNavController()
                .navigate(R.id.action_messageFragment_to_encryptFragment,bundle)
        }
        return view
    }
}