package com.example.calculationsappproject4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val inputNum: EditText = findViewById(R.id.numericInput)
        val kgButton: Button = findViewById(R.id.kgButton)
        val lbsButton: Button = findViewById(R.id.lbsButton)
        val result = " "



        kgButton.setOnClickListener { }
        lbsButton.setOnClickListener { }
        inputNum.setOnClickListener {
            //If kgButton clicked
            //then  result = inputNum * 2.205
            //If lbsButton clicked
            //then result = inputNum / 2.205
            //print result
        }




        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}