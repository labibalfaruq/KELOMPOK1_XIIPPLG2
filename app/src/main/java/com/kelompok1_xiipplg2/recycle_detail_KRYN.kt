package com.kelompok1_xiipplg2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kelompok1_xiipplg2.ROOM.database
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
        adapter=adapterkaryawan(arrayListOf())

        binding.tmbah.setOnClickListener{
            startActivity(
                Intent(
                    this,input_karyawan::class.java
                )
            )
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