package com.afaf.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.min

lateinit var number : TextView
lateinit var minus : Button
lateinit var plus : Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number = findViewById(R.id.tvNumber)
        minus = findViewById(R.id.btMinus)
        plus = findViewById(R.id.btPlus)


        plus.setOnClickListener {
            var currentNum = number.text.toString().toInt()
            currentNum++
            number.text = currentNum.toString()
        }

        minus.setOnClickListener {
            var currentNumber = number.text.toString().toInt()
            currentNumber--
            number.text = currentNumber.toString()
        }



    }
}