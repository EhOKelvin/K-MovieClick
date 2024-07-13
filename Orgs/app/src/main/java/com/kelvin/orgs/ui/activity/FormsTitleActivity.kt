package com.kelvin.orgs

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kelvin.orgs.dao.TitlesDAO
import com.kelvin.orgs.model.Titulo
import kotlin.math.log

class FormsTitleActivity : AppCompatActivity(R.layout.activity_forms_title) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val buttonSave = findViewById<Button>(R.id.ButtonSave)

        buttonSave.setOnClickListener {
            val nameZone = findViewById<EditText>(R.id.NameTitle)
            val name = nameZone.text.toString()

            val sinopseZone = findViewById<EditText>(R.id.SinopseTitle)
            val sinopse = sinopseZone.text.toString()

            val releaseYearZone = findViewById<EditText>(R.id.ReleaseYear)
            val releaseYear = releaseYearZone.text.toString().toInt()

            val GeneroDoFilmeZone = findViewById<EditText>(R.id.GeneroTitle)
            val generoTile = GeneroDoFilmeZone.text.toString()


            val title = Titulo(
                nomeDoTitulo = name,
                sinopse = sinopse,
                anoDeLancamento = releaseYear,
                generoDoFilm = generoTile,
            )

            val dao = TitlesDAO()
            dao.adicionar(title)
            Log.i("DAO", "onCreate: {$dao.search()}")
            finish()
        }
    }
}
