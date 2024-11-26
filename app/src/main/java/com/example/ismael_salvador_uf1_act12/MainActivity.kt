package com.example.ismael_salvador_uf1_act12

import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var horizontalScrollView: HorizontalScrollView
    private lateinit var scrollToggle: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialització dels elements
        horizontalScrollView = findViewById(R.id.horizontalScrollView)
        scrollToggle = findViewById(R.id.scrollToggle)

        // Controlar les línies de desplaçament en funció de l'estat del Switch
        scrollToggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Mostrar les línies de desplaçament (per defecte)
                horizontalScrollView.setHorizontalScrollBarEnabled(true)
            } else {
                // Ocultar les línies de desplaçament
                horizontalScrollView.setHorizontalScrollBarEnabled(false)
            }
        }
    }
}
