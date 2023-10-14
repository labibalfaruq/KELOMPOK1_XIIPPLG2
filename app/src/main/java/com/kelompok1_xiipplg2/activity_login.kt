package com.kelompok1_xiipplg2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import com.kelompok1_xiipplg2.databinding.ActivityLoginBinding

class activity_login : AppCompatActivity() {
    private lateinit var bind:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var etusername=findViewById<EditText>(R.id.username)
        var etpassword=findViewById<EditText>(R.id.password)
        var etlgn     =findViewById<ImageView>(R.id.btnlogin)
        etlgn.setOnClickListener{
            startActivity(Intent(this,profil::class.java)
            )
            etusername.setText("labib")
            etpassword.setText("12345")
        }


    }
}