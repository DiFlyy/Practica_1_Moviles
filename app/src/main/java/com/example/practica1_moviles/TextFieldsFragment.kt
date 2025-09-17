package com.example.practica1_moviles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class TextFieldsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_text_fields, container, false)

        val editText = view.findViewById<EditText>(R.id.editTextNombre)
        val btnMostrar = view.findViewById<Button>(R.id.btnMostrar)

        btnMostrar.setOnClickListener {
            val nombre = editText.text.toString()
            Toast.makeText(requireContext(), "Hola $nombre", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
