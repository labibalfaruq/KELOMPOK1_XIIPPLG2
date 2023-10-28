package com.kelompok1_xiipplg2.ROOM

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "tbkaryawan")
data class tbkaryawan(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id") val id : Int,
    @ColumnInfo(name = "nama") val nama : String,
    @ColumnInfo(name = "tanggal lahir")  val tanggal_lahir :String,
    @ColumnInfo(name = "alamat") val alamat : String,
    @ColumnInfo(name = "gender") val gender : String,
)
