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

        binding.texto0.setText("" + numero + " X 0 = " + multiplicacion(numero,0))
        binding.texto1.setText("" + numero + " X 1 = " + multiplicacion(numero,1))
        binding.texto2.setText("" + numero + " X 2 = " + multiplicacion(numero,2))
        binding.texto3.setText("" + numero + " X 3 = " + multiplicacion(numero,3))
        binding.texto4.setText("" + numero + " X 4 = " + multiplicacion(numero,4))
        binding.texto5.setText("" + numero + " X 5 = " + multiplicacion(numero,5))
        binding.texto6.setText("" + numero + " X 6 = " + multiplicacion(numero,6))
        binding.texto7.setText("" + numero + " X 7 = " + multiplicacion(numero,7))
        binding.texto8.setText("" + numero + " X 8 = " + multiplicacion(numero,8))
        binding.texto9.setText("" + numero + " X 9 = " + multiplicacion(numero,9))
        binding.texto10.setText("" + numero + " X 10 = " + multiplicacion(numero,10))
    }

    fun multiplicacion(numero:Int, numeroAMultiplicar:Int): Int {
        var resultado = numero * numeroAMultiplicar
        return resultado
    }
}