package com.kelvin.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kelvin.orgs.R
import com.kelvin.orgs.model.Titulo
import com.kelvin.orgs.ui.recyclerview.adapter.ListaDeTitulos
import kotlin.math.sin

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.reciclarView)

        recyclerView.adapter = ListaDeTitulos(
            context = this, titulos = listOf(
                Titulo(
                    nomeDoTitulo = "Vingadores Ultimatos",
                    anoDeLancamento = 2024,
                    generoDoFilm = "Acao e Aventura",
                    sinopse = "\n" + "Os Vingadores restantes unem forças para reverter o estalar de dedos de Thanos, que dizimou metade do universo. Usando a viagem no tempo, eles tentam recuperar as Joias do Infinito e restaurar a ordem, culminando em uma batalha épica contra Thanos."
                ),
                Titulo(
                    nomeDoTitulo = "Lost",
                    anoDeLancamento = 2006,
                    generoDoFilm = "Drama",
                    sinopse = "\n" +
                            "\"Lost\" segue os sobreviventes de um desastre aéreo em uma ilha misteriosa, onde enfrentam perigos sobrenaturais e descobrem segredos sombrios enquanto tentam encontrar um caminho para casa.",
                ),

                Titulo(
                    nomeDoTitulo = "Brooklyn Nine-Nine",
                    anoDeLancamento = 2013,
                    generoDoFilm = "Sitcoim",
                    sinopse = "\n" +
                            "\"Brooklyn Nine-Nine\" é uma comédia sobre o talentoso e imaturo detetive Jake Peralta e seus colegas excêntricos na 99ª Delegacia de Polícia do Brooklyn, liderados pelo sério e respeitável Capitão Holt."
                ),


                )
        )
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}