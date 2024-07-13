package com.kelvin.orgs.ui.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.kelvin.orgs.FormsTitleActivity
import com.kelvin.orgs.R
import com.kelvin.orgs.dao.TitlesDAO
import com.kelvin.orgs.model.Titulo
import com.kelvin.orgs.ui.recyclerview.adapter.ListaDeTitulos
import kotlin.math.sin

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onResume() {
        super.onResume()
        val recyclerView = findViewById<RecyclerView>(R.id.reciclarView)

        val dao = TitlesDAO()
        Log.i("MainActivity", "onCreate: ${dao.search()}")
        recyclerView.adapter = ListaDeTitulos(context = this, titulos = dao.search())


        val floatingButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        floatingButton.setOnClickListener {
            val intent = Intent(this, FormsTitleActivity::class.java)
            startActivity(intent)
        }

    }
}