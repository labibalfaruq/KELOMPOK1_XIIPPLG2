package com.kelompok1_xiipplg2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kelompok1_xiipplg2.ROOM.database
import com.kelompok1_xiipplg2.databinding.ActivityProfilBinding
import com.kelompok1_xiipplg2.databinding.ActivityRecycleDetailKrynBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class recycle_detail_KRYN : AppCompatActivity() {
    private lateinit var binding: ActivityRecycleDetailKrynBinding
    private lateinit var adapter: adapterkaryawan
    private val db by lazy { database(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRecycleDetailKrynBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding= ActivityRecycleDetailKrynBinding.inflate(layoutInflater)
        setContentView(binding.root)



        adapter=adapterkaryawan(arrayListOf())

        binding.tmbah.setOnClickListener{
            startActivity(
                Intent(
                    this,input_karyawan::class.java
                )
            )
        }
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

    override fun onResume() {
        super.onResume()
        this.set()
    }

    private fun set() {
       binding.rec.layoutManager=LinearLayoutManager(this)
        CoroutineScope(Dispatchers.IO).launch {
            adapter.setData(db.karyawandao().tampil_semua())
            withContext(Dispatchers.Main){
                adapter.notifyDataSetChanged()
            }

        }
        binding.rec.adapter=adapterkaryawan

    }



}