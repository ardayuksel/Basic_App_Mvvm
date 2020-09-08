package com.ardayuksel.basicappmvvm

import androidx.lifecycle.ViewModel

/*
* Created by ardayuksel
*/

/* Creating our viewmodel class with extending ViewModel */
class MainViewModel: ViewModel() {

    /* Define counter and its methods. It will used on activity class */
    var counter = 0

    fun increaseCounter(){
        counter++
    }

    fun decreaseCounter(){
        counter--
    }
}