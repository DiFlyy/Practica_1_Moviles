package com.example.practica1_moviles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast
import androidx.fragment.app.Fragment

class SeleccionFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_seleccion, container, false)

        val checkBox = view.findViewById<CheckBox>(R.id.checkBox)
        val switch1 = view.findViewById<Switch>(R.id.switch1)
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(requireContext(), "CheckBox: $isChecked", Toast.LENGTH_SHORT).show()
        }

        switch1.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(requireContext(), "Switch: $isChecked", Toast.LENGTH_SHORT).show()
        }

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val selected = view.findViewById<RadioButton>(checkedId).text
            Toast.makeText(requireContext(), "Radio seleccionado: $selected", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
