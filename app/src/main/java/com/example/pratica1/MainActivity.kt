package com.example.pratica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var fieldtext: TextView
    private lateinit var array: MutableList<Int>
    private lateinit var background: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.fieldtext = findViewById(R.id.textView1)
        this.background = findViewById(R.id.view2);
    }

    fun gerarNumeros(): MutableList<Int>{
        var lista:MutableList<Int> = mutableListOf();
        while(lista.size < 3){
            lista.add(Random.nextInt(0,255))
        }
        return lista
    }
    fun passaParaView(view: View){
        this.array = gerarNumeros();
        this.fieldtext.text = array.toString();
        this.background.setBackgroundColor(android.graphics.Color.rgb(array[0],array[1],array[2]));
        this.fieldtext.setTextColor(android.graphics.Color.rgb(255-array[0],255-array[1],255-array[2]));
    }

}