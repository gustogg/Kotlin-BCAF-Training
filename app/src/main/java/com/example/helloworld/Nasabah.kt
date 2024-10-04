package com.example.helloworld

import android.util.Log

abstract class Nasabah(private val nama: String, private val jumlahPinjaman: Double,) {

    abstract fun totalPinjaman(): Double

    open fun getNamaNasabah(): String{
        return nama

    }

}