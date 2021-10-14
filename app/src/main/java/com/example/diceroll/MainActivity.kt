package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val buttonToast: Button = findViewById(R.id.button_toast)
        buttonToast.setOnClickListener { showToast() }

    val buttonRoll: Button = findViewById(R.id.button_roll)
        buttonRoll.setOnClickListener { rollDice() }
    }

    private fun showToast(){
        Toast.makeText(this, "Ooh my, you have toasted me", Toast.LENGTH_SHORT).show()
    }
    private fun rollDice(){
        val generatedRandom = (1..6).random()

        val textviewresult: TextView = findViewById(R.id.text_result)
        textviewresult.text = generatedRandom.toString()
    }
}