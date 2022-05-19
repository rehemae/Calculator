package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.max
import kotlin.math.min

class calculateActivity : AppCompatActivity() {
    lateinit var etnumber1: EditText
    lateinit var etnumber2: EditText
    lateinit var btnadd: Button
    lateinit var btnmin: Button
    lateinit var btnMult: Button
    lateinit var btnModule: Button
    lateinit var tvtotal: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        btnmin = findViewById(R.id.btnmin)
        btnadd = findViewById(R.id.btnadd)
        btnMult = findViewById(R.id.btnMult)
        btnModule = findViewById(R.id.btnModule)
        etnumber1 = findViewById(R.id.etnumber1)
        etnumber2 = findViewById(R.id.etnumber2)
        tvtotal = findViewById(R.id.tvtotal)


        btnadd.setOnClickListener {


            var number1 = etnumber1.text.toString()
            var number2 = etnumber2.text.toString()
            if (number1.isBlank()){
                etnumber1.error = "Number required"
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etnumber1.error = "Number required"
                return@setOnClickListener
            }

            Add(number1.toDouble(), number2.toDouble())

        }
        btnMult.setOnClickListener {
            var number1 = etnumber1.text.toString()
            var number2 = etnumber2.text.toString()
            if (number1.isBlank()){
                etnumber1.error = "Number required"
                return@setOnClickListener
            }
            if (number1.isBlank()){
                etnumber1.error = "Number required"
                return@setOnClickListener
            }
            max(number1.toDouble(), number2.toDouble())
        }

        btnmin.setOnClickListener {
            var number1 = etnumber1.text.toString()
            var number2 = etnumber2.text.toString()
            if (number1.isBlank()){
                etnumber1.error = "Number required"
                return@setOnClickListener
            }
            if (number1.isBlank()){
                etnumber1.error = "Number required"
                return@setOnClickListener
            }
            subraction(number1.toDouble(), number2.toDouble())
        }
        btnModule.setOnClickListener {
            var number1 = etnumber1.text.toString()
            var number2 = etnumber2.text.toString()
            if (number1.isBlank()){
                etnumber1.error = "Number required"
                return@setOnClickListener
            }
            if (number1.isBlank()){
                etnumber1.error = "Number required"
                return@setOnClickListener
            }
            modulus(number1.toDouble(), number2.toDouble())
        }

    }
   fun Add(number1:Double, number2:Double){
       var total = number1+number2
        tvtotal.text= total.toString()
    }
    fun subraction(number1:Double, number2:Double) {
        var total = number1 - number2
        tvtotal.text = total.toString()

    }
    fun max(number1:Double, number2:Double) {
        var total = number1 * number2
        tvtotal.text = total.toString()
    }
    fun modulus(number1:Double, number2:Double) {
        var total = number1 % number2
        tvtotal.text = total.toString()
    }
    }


