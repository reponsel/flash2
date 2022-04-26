package com.subfire.flash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.subfire.flash.login.ui.view.LoginFragment
import com.subfire.flash.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}