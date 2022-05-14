package com.example.calculatoractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btncalculate :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btncalculate=findViewById(R.id.btncalculate)
        btncalculate.setOnClickListener {
            val intent = Intent(this, calculatorActivity::class.java)
            startActivity(intent)



        }

    }


}

