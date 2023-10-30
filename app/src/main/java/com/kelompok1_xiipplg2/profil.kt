package com.kelompok1_xiipplg2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kelompok1_xiipplg2.ROOM.database
import com.kelompok1_xiipplg2.databinding.ActivityProfilBinding


class profil : AppCompatActivity() {
    private lateinit var binding: ActivityProfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding=ActivityProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottom=binding.navbottom


        bottom.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.home -> startActivity(Intent(this,profil::class.java))
                R.id.karyawan -> startActivity(Intent(this, input_karyawan::class.java))
                R.id.pesan -> startActivity(Intent(this, ActivityMenu::class.java))
                R.id.data -> startActivity(Intent(this, recycle_detail_KRYN::class.java))
                R.id.detail -> startActivity(Intent(this, riwayat_pesanan::class.java))
            }
            true



        }

    }
}