package com.example.practica1_moviles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BotonesFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_botones, container, false)

        view.findViewById<Button>(R.id.btnNormal).setOnClickListener {
            Toast.makeText(requireContext(), "Button presionado", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<ImageButton>(R.id.imageBtn).setOnClickListener {
            Toast.makeText(requireContext(), "ImageButton presionado", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            Toast.makeText(requireContext(), "FAB presionado", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
