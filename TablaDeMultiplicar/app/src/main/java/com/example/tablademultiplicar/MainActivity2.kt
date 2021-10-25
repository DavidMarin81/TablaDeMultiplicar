package com.example.tablademultiplicar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablademultiplicar.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var numero = Integer.parseInt(intent.getStringExtra("numero"))

        binding.texto0.setText("" + numero + " X 0 =")
        binding.resultado0.setText(multiplicacion(numero, 0).toString())
        binding.texto1.setText("" + numero + " X 1 =")
        binding.resultado1.setText(multiplicacion(numero, 1).toString())
        binding.texto2.setText("" + numero + " X 2 =")
        binding.resultado2.setText(multiplicacion(numero, 2).toString())
        binding.texto3.setText("" + numero + " X 3 =")
        binding.resultado3.setText(multiplicacion(numero, 3).toString())
        binding.texto4.setText("" + numero + " X 4 =")
        binding.resultado4.setText(multiplicacion(numero, 4).toString())
        binding.texto5.setText("" + numero + " X 5 =")
        binding.resultado5.setText(multiplicacion(numero, 5).toString())
        binding.texto6.setText("" + numero + " X 6 =")
        binding.resultado6.setText(multiplicacion(numero, 6).toString())
        binding.texto7.setText("" + numero + " X 7 =")
        binding.resultado7.setText(multiplicacion(numero, 7).toString())
        binding.texto8.setText("" + numero + " X 8 =")
        binding.resultado8.setText(multiplicacion(numero, 8).toString())
        binding.texto9.setText("" + numero + " X 9 =")
        binding.resultado9.setText(multiplicacion(numero, 9).toString())
        binding.texto10.setText("" + numero + " X 10 = " + multiplicacion(numero,10))
        binding.resultado10.setText(multiplicacion(numero, 10).toString())
    }

    fun multiplicacion(numero:Int, numeroAMultiplicar:Int): Int {
        var resultado = numero * numeroAMultiplicar
        return resultado
    }
}