package com.Marcos.MeuPrimeiroApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val res = arrayOf("Sim", "Não conte com isso!", "Talvez")
    val random = Random.Default

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (editTextTextPersonName.text.isEmpty()){
                textView.text = "Faça uma pergunta"
            }else {
                val index: Int = random.nextInt(until = 3)
                textView.text = res[index]
            }
        }
    }
}