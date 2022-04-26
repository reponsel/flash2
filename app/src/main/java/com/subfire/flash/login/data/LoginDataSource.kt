package com.subfire.flash.login.data

import com.subfire.flash.login.data.repository.RemoteRepostory
import javax.inject.Inject

class LoginDataSource @Inject constructor(val remoteRepostory: RemoteRepostory) {

    suspend fun getTest() = remoteRepostory.getTest()
}