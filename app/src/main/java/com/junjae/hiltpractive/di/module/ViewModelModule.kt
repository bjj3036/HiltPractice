package com.junjae.hiltpractive.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.junjae.hiltpractive.viewmodel.ViewModelFactory
import com.junjae.hiltpractive.viewmodel.main.MainViewModel
import com.mhq.im.driver.di.util.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class ViewModelModule {

    @Binds
    @Singleton
    abstract fun bindsViewModelProviderFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindsLoginViewModel(loginViewModel: MainViewModel): ViewModel
}