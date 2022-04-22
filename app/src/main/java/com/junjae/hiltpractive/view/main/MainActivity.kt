package com.junjae.hiltpractive.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.junjae.hiltpractive.R
import com.junjae.hiltpractive.model.Calculator
import com.junjae.hiltpractive.model.CalculatorImpl
import com.junjae.hiltpractive.viewmodel.main.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var string: String

    @Inject
    lateinit var calculatorImpl: CalculatorImpl

    @Inject
    lateinit var calculator: Calculator

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        txt_main.text = "$string ${calculatorImpl.sum(2, 3)} ${calculatorImpl == calculator}"
    }
}