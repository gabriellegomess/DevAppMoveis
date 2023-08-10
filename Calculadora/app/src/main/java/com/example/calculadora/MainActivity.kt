package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val somarBotao: Button = findViewById(R.id.somarBotao)
    val valor1: EditText = findViewById(R.id.number1)
    val valor2: EditText = findViewById(R.id.number2)

        somarBotao.setOnClickListener {

            val numero1 = valor1
            val numero2 = valor2
            val totalSoma = numero1 + numero2
            
        }


    }
}