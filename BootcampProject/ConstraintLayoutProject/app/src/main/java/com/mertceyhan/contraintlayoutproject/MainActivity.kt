package com.mertceyhan.contraintlayoutproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textInputEditTextUsername: TextInputEditText =
            findViewById(R.id.textInputEditTextUsername)

        val textInputEditTextPassword: TextInputEditText =
            findViewById(R.id.textInputEditTextPassword)

        val buttonLogin: MaterialButton =
            findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            Toast.makeText(
                this,
                "${textInputEditTextUsername.text} - ${textInputEditTextPassword.text}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}