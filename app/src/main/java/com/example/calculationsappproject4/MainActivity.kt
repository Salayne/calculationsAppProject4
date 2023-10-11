package com.example.calculationsappproject4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate()
    }

    private fun calculate() {
        val inputNumText: EditText = findViewById(R.id.numericInput)
        val kgButton: Button = findViewById(R.id.kgButton)
        val lbsButton: Button = findViewById(R.id.lbsButton)
        val clearButton: Button = findViewById(R.id.clearButtton)
        val display = findViewById<TextView>(R.id.resultsDisplay)
        val kglbs = findViewById<TextView>(R.id.kgorlbs)




        kgButton.setOnClickListener {
            val inputValue = inputNumText.text.toString().toDouble()
            val result = inputValue * 2.2
            //2 decimal place format
            val formattedResult = "%.2f".format(result)

            display.text = "$formattedResult"
            kglbs.text = "lbs"
        }

        lbsButton.setOnClickListener {
            val inputValue = inputNumText.text.toString().toDouble()
            val result = inputValue / 2.2
            //2 decimal place format
            val formattedResult = "%.2f".format(result)

            display.text = "$formattedResult"
            kglbs.text = "kg"
        }


        clearButton.setOnClickListener {
            display.text = " "
            inputNumText.text.clear()
            kglbs.text = " "
        }

    }

}