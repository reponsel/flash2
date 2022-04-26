package com.subfire.flash.login.domain

import com.subfire.flash.login.data.LoginDataSource
import javax.inject.Inject

class LoginUseCase @Inject constructor(val loginDataSource: LoginDataSource) {

    suspend fun getTest() = loginDataSource.getTest()
}