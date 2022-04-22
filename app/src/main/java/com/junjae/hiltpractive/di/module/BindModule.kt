package com.junjae.hiltpractive.di.module

import com.junjae.hiltpractive.model.Calculator
import com.junjae.hiltpractive.model.CalculatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class BindModule {

    @Binds
    abstract fun bindsCalculator(calculatorImpl: CalculatorImpl): Calculator

}