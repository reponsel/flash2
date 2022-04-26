package com.subfire.flash.login.ui.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.subfire.flash.login.di.DaggerLoginComponent
import com.subfire.flash.login.domain.LoginUseCase
import com.subfire.flash.login.ui.viewModel.LoginViewModel
import javax.inject.Inject

class LoginViewModelFactory : ViewModelProvider.Factory {

    @Inject
    lateinit var loginUseCase : LoginUseCase

    init {
        DaggerLoginComponent.create().inject(this)
    }


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java))
            return LoginViewModel(loginUseCase) as T
        else
            throw IllegalArgumentException("Unknown class name")
    }
}