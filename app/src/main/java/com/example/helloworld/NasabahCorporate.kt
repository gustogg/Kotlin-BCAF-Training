package com.example.helloworld

import android.util.Log

class NasabahCorporate(val nama:String, val jumlahPinjaman: Double, val tenor: Int ) : Nasabah(nama, jumlahPinjaman), Pinjaman {

    private val bunga : Double = 0.03 //bunga = 2%

    override fun totalPinjaman(): Double {
        return jumlahPinjaman+hitungBunga()
    }

    override fun hitungBunga(): Double {
        return jumlahPinjaman*bunga*tenor
    }

    override fun simulasiCicilan() {
        val cicilanPerbulan : Double = totalPinjaman()/tenor
        var infoSimulasi: String = ""
        var bulan: Int = 1
        while (bulan < tenor){
        infoSimulasi = infoSimulasi.plus("Cicilan ke -").plus(bulan).plus("adalah Rp.").plus(cicilanPerbulan).plus(" ")
            bulan++
        }
        Log.d("CicilanSimmulasi", infoSimulasi.toString())
    }

    override fun infoPinjaman() {
        val info: String = "Perusahaan : ".plus(getNamaNasabah())
        Log.d("Info", info)

    }
}