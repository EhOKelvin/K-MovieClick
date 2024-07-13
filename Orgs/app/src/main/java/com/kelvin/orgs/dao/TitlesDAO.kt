package com.kelvin.orgs.dao

import com.kelvin.orgs.model.Titulo

class TitlesDAO {

    fun adicionar(titulo: Titulo) {
        titulosDao.add(titulo)
    }

    fun search(): List<Titulo> {
        return titulosDao.toList()
    }

    companion object {
        private val titulosDao = mutableListOf<Titulo>()
    }

}