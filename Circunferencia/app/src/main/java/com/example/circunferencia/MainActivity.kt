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

        //Criando as variaveis que irão receber os valores para calcular

        //variavel para o usuario inserir o valor do raio para que seja calculado a circunferência
        val radiusEditText: EditText = findViewById(R.id.radiusEditText)
        //Botão para calcular, iniciar a aplicação do calculo
        val calculateButton: Button = findViewById(R.id.calculateButton)
        //Resultado printado na tela
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        //função que o botão calcular vai fazer
        calculateButton.setOnClickListener {//vai realizar a função assim que clicarmos
            //recebe a variavel do  raio
            val radiusText = radiusEditText.text.toString()
            //Se o valor nao estiver vazio ele vai calcular a circunferência
            if (radiusText.isNotEmpty()) {
                val radius = radiusText.toDouble()
                val circumference = 2 * PI * radius //formula da circunferencia com o raio
                //resultTextView.text = "Circunferência: $circumference" //printa o resultado
                resultTextView.text = String.format("Área do Triângulo: %.2f", circumference)
            } else {
                resultTextView.text = "Insira um raio válido" //se raio estiver vazio ou invalido vai pedir um novo valor
            }
        }
    }
}
