package com.kelompok1_xiipplg2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelompok1_xiipplg2.databinding.ActivityLoginBinding

class activity_login : AppCompatActivity() {
    private lateinit var bind:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.btnlogin.setOnClickListener{
            startActivity(
                Intent(
                    this,profil::class.java
                )
            )

        }
        fun login(){
            val validusername="username123"
            val validpassword="password123"

            println("mohon isi username")
            val enterusername = readLine()

            println("isi passwordmu")
            val enterpassword = readLine()

            if (enterusername==validusername && enterpassword==validpassword){
                println("login berhasil")
            }else{
                println("login failed")
            }
        }


        setContentView(R.layout.activity_login)

    }
}