package com.kelompok1_xiipplg2.ROOM

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface menuDAO {
    @Query ("select * from menu")
    fun getall(): List<menu>
    @Insert
    fun simpan(menu:menu)
    @Delete
    fun hapus(menu: menu)

}