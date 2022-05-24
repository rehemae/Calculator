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
            var inputs = obtainInput()
            Add(inputs!!.number1, inputs!!.number2)
        }
        btnMult.setOnClickListener {
            var inputs = obtainInput()
            max(inputs!!.number1, inputs!!.number2)
        }

        btnmin.setOnClickListener {
            var inputs = obtainInput()
            subraction(inputs!!.number1, inputs!!.number2)
        }
        btnModule.setOnClickListener {
            var inputs = obtainInput()
            modulus(inputs!!.number1, inputs!!.number2)
        }

    }

    data class MyInputs(var number1: Double, var number2: Double)

    fun obtainInput(): MyInputs?{
        var number1 = etnumber1.text.toString()
        var number2 = etnumber2.text.toString()
        if (number1.isBlank()){
            etnumber1.error = "Number required"
            return null
        }
        if (number1.isBlank()){
            etnumber2.error = "Number required"
            return null
        }
        return MyInputs(number1.toDouble(), number2.toDouble())
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