package com.subfire.flash.login.di

import com.subfire.flash.login.ui.factory.LoginViewModelFactory
import dagger.Component

@Component(modules = [LoginModule::class])
interface LoginComponent {

    fun inject(loginViewModelFactory: LoginViewModelFactory)
}