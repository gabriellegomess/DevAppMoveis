package com.example.circunferencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.PI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radiusEditText: EditText = findViewById(R.id.radiusEditText)
        val calculateButton: Button = findViewById(R.id.calculateButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        calculateButton.setOnClickListener {
            val radiusText = radiusEditText.text.toString()
            if (radiusText.isNotEmpty()) {
                val radius = radiusText.toDouble()
                val circumference = 2 * PI * radius
                resultTextView.text = "Circunferência: $circumference"
            } else {
                resultTextView.text = "Insira um raio válido"
            }
        }
    }
}
