package com.example.nav
import android.content.Intent
import android.widget.Button
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var buttonT1: Button
    private lateinit var button3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        buttonT1 = findViewById(R.id.buttonT1)
        button3 = findViewById(R.id.button3Main)
        buttonT1.setOnClickListener {
                                    val intent = Intent(
                                        this,
                                        Segunda_Tela::class.java
                                    )
            startActivity(intent) }
        button3.setOnClickListener{
            val intent = Intent(this, TerceiraTela::class.java)
            startActivity(intent)
        }
    }
}