package com.example.practica1_moviles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListasFragment : Fragment() {

    private val items = listOf("Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_listas, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ListaAdapter(items)

        return view
    }

    class ListaAdapter(private val items: List<String>) : RecyclerView.Adapter<ListaAdapter.ViewHolder>() {

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val tvItem: TextView = itemView.findViewById(R.id.tvItem)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)
            return ViewHolder(view)
        }

        override fun getItemCount() = items.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.tvItem.text = items[position]
            holder.itemView.setOnClickListener {
                Toast.makeText(holder.itemView.context, "Seleccionaste ${items[position]}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
