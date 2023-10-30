package com.kelompok1_xiipplg2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kelompok1_xiipplg2.ROOM.database
import com.kelompok1_xiipplg2.databinding.ActivityProfilBinding


class profil : AppCompatActivity() {

    private lateinit var binding: ActivityProfilBinding
    private val db by lazy { database(this) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      val bottom = findViewById<BottomNavigationView>(R.id.navbottom)


        bottom.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.home -> {startActivity(Intent(this, activity_login::class.java))
                true
                }
                R.id.karyawan -> {startActivity(Intent(this,input_karyawan::class.java))
                true}
                R.id.pesan -> {startActivity(Intent(this,ActivityMenu::class.java))
                true }
                R.id.data -> {startActivity(Intent(this,recycle_detail_KRYN::class.java))
                true}
                R.id.detail -> {startActivity(Intent(this,riwayat_pesanan::class.java))
                true}
                else -> false
            }

        }

    }
}