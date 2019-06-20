package com.aridwiprayogo.cashflow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aridwiprayogo.cashflow.Utils.Summary


class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("HALOOOOO")

        val calc = Summary()

        val sum = calc.sum(5,3)
        println("result : $sum")
        val sub = calc.sub(5,3)
        println("result : $sub")
        val mul = calc.mul(5,3)
        println("result : $mul")
        val div = calc.div(5,3)
        println("result : $div")

    }
}
