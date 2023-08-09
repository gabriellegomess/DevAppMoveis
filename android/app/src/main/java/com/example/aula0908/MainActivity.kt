package com.example.aula0908
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var baseEditText: EditText
    private lateinit var alturaEditText: EditText
    private lateinit var resultadoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        baseEditText = findViewById(R.id.baseEditText)
        alturaEditText = findViewById(R.id.alturaEditText)
        resultadoTextView = findViewById(R.id.resultadoTextView)
    }

    fun calcularArea(view: View) {
        val baseStr = baseEditText.text.toString()
        val alturaStr = alturaEditText.text.toString()

        if (baseStr.isNotEmpty() && alturaStr.isNotEmpty()) {
            val base = baseStr.toDouble()
            val altura = alturaStr.toDouble()

            val area = (base * altura) / 2
            resultadoTextView.text = String.format("Área do Triângulo: %.2f", area)
        } else {
            resultadoTextView.text = "Insira valores válidos para base e altura."
        }
    }
}

