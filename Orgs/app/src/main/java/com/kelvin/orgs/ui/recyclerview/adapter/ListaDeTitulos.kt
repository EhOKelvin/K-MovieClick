package com.kelvin.orgs.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kelvin.orgs.R
import com.kelvin.orgs.model.Titulo
import java.util.zip.Inflater

class ListaDeTitulos(
    private val context: Context,
    private val titulos: List<Titulo>
) : RecyclerView.Adapter<ListaDeTitulos.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(titulo: Titulo) {
            val nomeDoTitulo = itemView.findViewById<TextView>(R.id.title)
            nomeDoTitulo.text = titulo.nomeDoTitulo
            val generoDoTitulo = itemView.findViewById<TextView>(R.id.generoDoFilme)
            generoDoTitulo.text = titulo.generoDoFilm
            val sinopse = itemView.findViewById<TextView>(R.id.sinopse)
            sinopse.text = titulo.sinopse
            val anoDeLancamento = itemView.findViewById<TextView>(R.id.anoDeLancamento)
            anoDeLancamento.text = titulo.anoDeLancamento.toString()


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaDeTitulos.ViewHolder {
        LayoutInflater.from(context)
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.caracteristicas_itens, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return titulos.size;
    }

    override fun onBindViewHolder(holder: ListaDeTitulos.ViewHolder, position: Int) {
        val titulo = titulos[position]
        holder.vincula(titulo)

    }

}
