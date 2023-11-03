package com.kelompok1_xiipplg2.ROOM

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface tbkaryawanDAO {

    @Insert
    fun simpan_data(vararg tbkaryawan: tbkaryawan)

    @Delete
    fun hapus_data (vararg tbkaryawan: tbkaryawan)

    @Query ("select * FROM tbkaryawan")
    fun tampil_semua():List<tbkaryawan>

}