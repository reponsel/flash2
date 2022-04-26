package com.subfire.flash.login.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.subfire.flash.login.domain.LoginUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class LoginViewModel @Inject constructor(val useCase: LoginUseCase) :ViewModel() {

    val testmutableLiveData : MutableLiveData<String> = MutableLiveData()

    fun getTest() = viewModelScope.launch { testmutableLiveData.postValue(useCase.getTest())  }
}