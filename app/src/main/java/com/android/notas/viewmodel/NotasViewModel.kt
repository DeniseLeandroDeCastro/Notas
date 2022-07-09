package com.android.notas.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.notas.data.GestorDeNotas
import com.android.notas.data.Nota

class NotasViewModel: ViewModel() {
    val gestorDeNotas = GestorDeNotas()

    private val mNotas = MutableLiveData<List<Nota>>()

    fun getNotas(): MutableLiveData<List<Nota>> = mNotas

    fun carregarNotas() {
        val tmp = gestorDeNotas.getNotas()
        mNotas.postValue(tmp)
    }
}