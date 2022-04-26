package com.subfire.flash.login.ui.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.subfire.flash.R
import com.subfire.flash.databinding.FragmentLoginBinding
import com.subfire.flash.login.ui.factory.LoginViewModelFactory
import com.subfire.flash.login.ui.viewModel.LoginViewModel



class LoginFragment : Fragment() {

    private val loginViewModel : LoginViewModel by viewModels() { LoginViewModelFactory()}
    lateinit var loginBinding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return DataBindingUtil.inflate<FragmentLoginBinding>(inflater,R.layout.fragment_login,container,false).let {
            loginBinding = it
            it.root
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginViewModel.getTest()

        loginViewModel.testmutableLiveData.observe(viewLifecycleOwner) {
            Log.d("test", "onViewCreated: $it")
        }

    }

}