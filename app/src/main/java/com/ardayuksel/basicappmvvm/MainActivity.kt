package com.ardayuksel.basicappmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LifecycleOwner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        var viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        tvCounter.text = viewModel.counter.toString()

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