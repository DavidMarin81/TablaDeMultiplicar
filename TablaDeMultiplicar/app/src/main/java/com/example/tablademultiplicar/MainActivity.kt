package com.example.tablademultiplicar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablademultiplicar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    var numero = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton0.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("numero", "0"))
        }

        binding.boton1.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("numero", "1"))
        }

        binding.boton2.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("numero", "2"))
        }

        binding.boton3.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("numero", "3"))
        }

        binding.boton4.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("numero", "4"))
        }

        binding.boton5.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("numero", "5"))
        }

        binding.boton6.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("numero", "6"))
        }

        binding.boton7.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("numero", "7"))
        }

        binding.boton8.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("numero", "8"))
        }

        binding.boton9.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("numero", "9"))
        }

        binding.boton10.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("numero", "10"))
        }

    }
}