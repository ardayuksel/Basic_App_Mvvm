package com.ardayuksel.basicappmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

/*
* Created by ardayuksel
*
* Our project purpose is that looking the ViewModel's job.
* Thank to ViewModel, when screen rotation is changed, ViewModel lifecycle will keep state values on UI
* So, the value will continue from where it left off.
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        /* Defining viewmodel variable from MainViewModel class that we created */
        var viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        tvCounter.text = viewModel.counter.toString()

        /* Setting button events and calling methods from our viewmodel class */
        btnIncrease.setOnClickListener {
            viewModel.increaseCounter()
            tvCounter.text = viewModel.counter.toString()
        }

        btnDecrease.setOnClickListener {
            viewModel.decreaseCounter()
            tvCounter.text = viewModel.counter.toString()
        }

    }
}