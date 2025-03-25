package com.example.nav
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class TerceiraTela : AppCompatActivity() {
    private lateinit var button3tela: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira_tela)
        button3tela = findViewById(R.id.buttonTerceiraTela)
        button3tela.setOnClickListener{
            val intent = Intent(
                this, MainActivity::class.java)
            startActivity(intent)}
    }

}