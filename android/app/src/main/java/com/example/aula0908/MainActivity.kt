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

        //atribuindo as variaveis e os ID para realizar as funções
        baseEditText = findViewById(R.id.baseEditText)
        alturaEditText = findViewById(R.id.alturaEditText)
        resultadoTextView = findViewById(R.id.resultadoTextView)
    }

    //função para calcular a area do triangulo baseado na base e altura
    fun calcularArea(view: View) {
        //variavel para calcular, pegando o Id de cada uma delas
        val baseStr = baseEditText.text.toString()
        val alturaStr = alturaEditText.text.toString()

        //condição para que se a base e a altura nao estiverem vazias a aplicação será realizada
        if (baseStr.isNotEmpty() && alturaStr.isNotEmpty()) {
            val base = baseStr.toDouble()
            val altura = alturaStr.toDouble()
//formula para calcular, pegando a base a altura dadas pelo usuario
            val area = (base * altura) / 2
            resultadoTextView.text = String.format("Área do Triângulo: %.2f", area)
        } else {
            //caso os valores estejam vazios
            resultadoTextView.text = "Insira valores válidos para base e altura."
        }
    }
}

