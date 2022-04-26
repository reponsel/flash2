package com.subfire.flash.login.data.repository

import javax.inject.Inject

class RemoteRepostory @Inject constructor() {

    suspend fun getTest() = "test in"
}