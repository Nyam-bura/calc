package com.example.calculatoractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculatorActivity : AppCompatActivity() {

    lateinit var  etnum: EditText
    lateinit var etnums: EditText
    lateinit var btnadd: Button
    lateinit var btnsub: Button
    lateinit var btnmult: Button
    lateinit var btnmod: Button
    lateinit var tvres: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        btnadd=findViewById(R.id.btnadd)
        btnsub=findViewById(R.id.btnsub)
        btnmult=findViewById(R.id.btnmult)
        btnmod=findViewById(R.id.btnmod)
        tvres=findViewById(R.id.tvres)
        etnums= findViewById(R.id.etnums)
        etnum= findViewById(R.id.etnum)


        btnadd.setOnClickListener{
            var number = etnums.text.toString().toInt()
            var numbers= etnum.text.toString().toInt()
            addition(number,numbers)



        btnsub.setOnClickListener{
            var number= etnums.text.toString().toInt()
            var numbers= etnum.text.toString().toInt()
            subtraction(number,numbers)
        }
        btnmult.setOnClickListener {
            var number= etnums.text.toString().toInt()
            var numbers= etnum.text.toString().toInt()
            mult(number,numbers)
        }
        }
        btnmod.setOnClickListener {
            var num1= etnums.text.toString().toInt()
            var numss= etnum.text.toString().toInt()
            modulus(num1,numss)
        }


    }

     fun addition(number: Int, numbers: Int) {
        var addnum= (number+numbers)
        tvres.text= addnum.toString()
    }

    fun subtraction(number: Int, numbers: Int) {
         var subnum= (number-numbers)
         tvres.text= subnum.toString()

    }

    fun modulus(num1: Int, numss: Int) {
        var modnums= (num1%numss)
        tvres.text= modnums.toString()
    }

    fun mult(number: Int, numbers: Int) {
        var mulnum= (number*numbers)
        tvres.text= mulnum.toString()


    }



    }

