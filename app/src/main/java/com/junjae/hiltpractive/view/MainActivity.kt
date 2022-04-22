package com.junjae.hiltpractive.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.junjae.hiltpractive.R
import com.junjae.hiltpractive.model.Calculator
import com.junjae.hiltpractive.model.CalculatorImpl
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_main.text = "$string ${calculatorImpl.sum(2, 3)} ${calculatorImpl == calculator}"
    }
}