package com.lexmasterteam.kotlinscopestest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var number: Int? = null

    private var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // null check
        val x = number?.let {
            val number2 = it+1
            number2 // zwraca to jeśli number nie jest nullem
        } ?: 3

        val intent = Intent().apply {
            putExtra("","")
            putExtra("",0)
            action = ""
            //this <- gdyby był run zamiast apply
        } //przydatne do ustalania jakiś wartości, można też użyć run wtedy zwracana jest yulko ostatnia linia
    }
    fun getSquaredI() = (i * i).also { i++ }
}