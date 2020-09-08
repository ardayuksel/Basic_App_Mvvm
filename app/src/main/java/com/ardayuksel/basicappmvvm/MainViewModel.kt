package com.ardayuksel.basicappmvvm

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var counter = 0

    fun increaseCounter(){
        counter++
    }

    fun decreaseCounter(){
        counter--
    }
}