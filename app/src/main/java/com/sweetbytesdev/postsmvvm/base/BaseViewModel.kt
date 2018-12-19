package com.sweetbytesdev.postsmvvm.base

import android.arch.lifecycle.ViewModel
import com.sweetbytesdev.postsmvvm.injection.component.DaggerViewModelInjector
import com.sweetbytesdev.postsmvvm.injection.component.ViewModelInjector
import com.sweetbytesdev.postsmvvm.injection.module.NetworkModule
import com.sweetbytesdev.postsmvvm.ui.PostListViewModel

abstract class BaseViewModel: ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}