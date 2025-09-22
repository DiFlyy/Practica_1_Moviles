package com.example.practica1_moviles

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Cargar fragment inicial
        replaceFragment(TextFieldsFragment())

        // Botones de navegación
        findViewById<Button>(R.id.btnTextFields).setOnClickListener {
            replaceFragment(TextFieldsFragment())
        }
        findViewById<Button>(R.id.btnBotones).setOnClickListener {
            replaceFragment(BotonesFragment())
        }
        findViewById<Button>(R.id.btnSeleccion).setOnClickListener {
            replaceFragment(SeleccionFragment())
        }
        findViewById<Button>(R.id.btnListas).setOnClickListener {
            replaceFragment(ListasFragment())
        }
        findViewById<Button>(R.id.btnInformacion).setOnClickListener {
            replaceFragment(InformacionFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
