package com.junjae.hiltpractive.model

import javax.inject.Inject

class CalculatorImpl @Inject constructor() : Calculator {
    override fun sum(a: Int, b: Int): Int = a + b

    override fun minus(a: Int, b: Int): Int = a - b

    override fun multiply(a: Int, b: Int): Int = a * b
}