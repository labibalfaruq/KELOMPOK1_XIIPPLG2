package com.kelompok1_xiipplg2.ROOM

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [menu::class,tbkaryawan::class], version = 1, exportSchema = false)
abstract class database:RoomDatabase(){
    abstract fun tbmenudao():menuDAO
    abstract fun karyawandao():tbkaryawanDAO
    companion object {
        @Volatile
        private var Instance:database? = null
            private val lock =Any()
        operator fun invoke(context: Context)= Instance ?: synchronized(lock){
            getDatabase(context).also{
                Instance
            }
        }

        fun getDatabase(context: Context)=Room.databaseBuilder(
            context.applicationContext,
            database::class.java,
            "cafecuky"
        )
            .build()
    }
}