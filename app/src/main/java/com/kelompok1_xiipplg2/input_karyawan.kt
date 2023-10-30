package com.kelompok1_xiipplg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelompok1_xiipplg2.ROOM.database
import com.kelompok1_xiipplg2.databinding.ActivityInputKaryawanBinding

class input_karyawan : AppCompatActivity() {

    private lateinit var binding: ActivityInputKaryawanBinding
    private lateinit var adapter:adapterkaryawan
    private val db by lazy { database(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_input_karyawan)
    }
}