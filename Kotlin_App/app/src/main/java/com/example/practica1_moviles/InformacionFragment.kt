package com.example.practica1_moviles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class InformacionFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_informacion, container, false)

        val tvInfo = view.findViewById<TextView>(R.id.tvInfo)
        val imageView = view.findViewById<ImageView>(R.id.imageView)
        val progressBar = view.findViewById<ProgressBar>(R.id.progressBar)

        imageView.setOnClickListener {
            tvInfo.text = "Has tocado la imagen"
            progressBar.progress = (progressBar.progress + 10).coerceAtMost(100)
            Toast.makeText(requireContext(), "Progreso actualizado", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
