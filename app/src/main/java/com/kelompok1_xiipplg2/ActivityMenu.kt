package com.kelompok1_xiipplg2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelompok1_xiipplg2.databinding.ActivityMenuBinding
import com.kelompok1_xiipplg2.databinding.ActivityProfilBinding
import com.kelompok1_xiipplg2.databinding.ActivityRiwayatPesananBinding

class ActivityMenu : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        binding= ActivityMenuBinding.inflate(layoutInflater)
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