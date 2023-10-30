package com.kelompok1_xiipplg2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.kelompok1_xiipplg2.ROOM.tbkaryawan

class adapterkaryawan (var list:ArrayList<tbkaryawan>):
        RecyclerView.Adapter<adapterkaryawan.karyawanholder>(){
            class karyawanholder(view: View):RecyclerView.ViewHolder(view){
                val idk =itemView.findViewById<EditText>(R.id.ID_ADPTR_DTL)
                val nama=itemView.findViewById<EditText>(R.id.NamaADPTR_DTL)
                val ttl=itemView.findViewById<EditText>(R.id.TGLADPTR_DTL)
                val alamat=itemView.findViewById<EditText>(R.id.AlamatADPTR_DTL)
                val gender=itemView.findViewById<EditText>(R.id.GenderADPTR_DTL)

            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): karyawanholder {
       val view=LayoutInflater.from(parent.context).inflate(
           R.layout.activity_adapter_detail_karyawan,parent,false
       )
        return karyawanholder(view)
    }

    override fun onBindViewHolder(holder: karyawanholder, position: Int) {
        holder.nama.text=list[position].nama_karyawan
        holder.idk.text=list[position].id_karyawan.toString()
        holder.ttl.text=list[position].tanggal_lahir
        holder.alamat.text=list[position].alamat_karyawan
        holder.gender.text=list[position].gender_karyawan
    }

    override fun getItemCount(): Int {
       return list.size
    }

    fun setData(tampilSemua: List<tbkaryawan>) {
        list.clear()
        list.addAll(tampilSemua)
    }

}