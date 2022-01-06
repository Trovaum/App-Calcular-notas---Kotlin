package com.example.calculadoradenotas

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result: TextView = result

        button_calculate.setOnClickListener {
            val nota1 = Integer.parseInt(nota_1.text.toString())
            val nota2 = Integer.parseInt(nota_2.text.toString())
            val falta = Integer.parseInt(faltas.text.toString())
            val media = (nota1 + nota2) / 2

            if (media >= 6 && falta <= 10) {
                result.text = "Aluno foi Aprovado \n Nota final: $media\n Faltas: $falta"
                result.setTextColor(Color.GREEN)
            } else {
                result.text = "Aluno foi Reprovado \n Nota final: $media\n Faltas: $falta"
                result.setTextColor(Color.RED)
            }

        }

    }
}