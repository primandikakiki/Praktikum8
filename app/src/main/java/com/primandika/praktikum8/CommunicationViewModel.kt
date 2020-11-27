package com.primandika.praktikum8

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    // membuat variabel live data dengan tipe String
    private val mName = MutableLiveData<String>()
    val name: LiveData<String>
        get() = mName

    // method untuk set nama
    fun setName(name: String) {
        mName.value = name
    }
}
