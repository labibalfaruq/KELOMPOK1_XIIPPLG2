package com.kelompok1_xiipplg2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelompok1_xiipplg2.ROOM.database
import com.kelompok1_xiipplg2.ROOM.tbkaryawan
import com.kelompok1_xiipplg2.databinding.ActivityInputKaryawanBinding
import com.kelompok1_xiipplg2.databinding.ActivityProfilBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class input_karyawan : AppCompatActivity() {

    private lateinit var binding: ActivityInputKaryawanBinding
    private val db by lazy { database(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInputKaryawanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btntambah.setOnClickListener{
            datakaryawan()
            binding= ActivityInputKaryawanBinding.inflate(layoutInflater)
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

    private fun datakaryawan() {
      CoroutineScope(Dispatchers.IO).launch {
          db.karyawandao().simpan_data(
              tbkaryawan(
                  0,
                  binding.namakaryawan.text.toString(),
                  binding.TTL.text.toString(),
                  binding.alamat.text.toString(),
                  binding.rd.toString()
              )
          )
          finish()
      }
    }
}