package com.example.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        val txtHello = findViewById<TextView>(R.id.txtHello)
//        txtHello.text = "lorem ipsum sir amet dolor."


        val nasabahIndividu = NasabahIndividu("Gustoc", 10000000.0, 12)
        val nasabahCorporate = NasabahCorporate("PT Lestari", 100000000.0, 12)

        nasabahIndividu.infoPinjaman()
        nasabahIndividu.simulasiCicilan()

        nasabahCorporate.infoPinjaman()
        nasabahCorporate.simulasiCicilan()

        val financeCompany = FinanceCompany()

        financeCompany.addNasabah(nasabahIndividu)
        financeCompany.addNasabah(nasabahCorporate)
        financeCompany.getAllNasabahInfo()
        val arrayText = arrayOf("Gus", "To", 1)
//        val angka = int;


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}