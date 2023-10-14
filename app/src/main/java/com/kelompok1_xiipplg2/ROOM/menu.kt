package com.kelompok1_xiipplg2.ROOM

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity (tableName = "menu")
class menu (
    @PrimaryKey (autoGenerate = false)
    @ColumnInfo (name = "americano") val americano:String,
    @ColumnInfo (name ="arabika" )val arabika :String,
    @ColumnInfo (name = "cookies")val cookies :String,
    @ColumnInfo (name = "kopi susu")val kopi_susu:String,
    @ColumnInfo (name = "mie goreng")val mie_goreng : String,
    @ColumnInfo (name = "french fries")val french_fries: String,
)