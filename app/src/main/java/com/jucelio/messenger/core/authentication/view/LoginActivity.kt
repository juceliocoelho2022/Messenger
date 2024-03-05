package com.jucelio.messenger.core.authentication.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.jucelio.messenger.R

interface LoginCallback{
    fun onCreateAccountClicked()
    fun onLoginClicked()
}
class LoginActivity : AppCompatActivity(),LoginCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
    }

    override fun onCreateAccountClicked() {
        val fragment = SignUpFragment()
        supportFragmentManager.commit {
            replace(R.id.fragment_container_view, fragment)
            addToBackStack(null)
        }
    }

    override fun onLoginClicked() {
       supportFragmentManager.popBackStack()
    }
}