package com.kelompok1_xiipplg2.ROOM

import androidx.room.*

@Dao
interface tbkaryawanDAO {
    @Insert
    fun simpan_data(vararg tbkaryawan: tbkaryawan)

    @Delete
    fun hapus_data(tbkaryawan: tbkaryawan)

    @Query("SELECT * FROM tbkaryawan")
    fun tampil_semua():List<tbkaryawan>
}