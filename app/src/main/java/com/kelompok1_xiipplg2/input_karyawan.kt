package com.kelompok1_xiipplg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelompok1_xiipplg2.ROOM.database
import com.kelompok1_xiipplg2.ROOM.tbkaryawan
import com.kelompok1_xiipplg2.databinding.ActivityInputKaryawanBinding
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