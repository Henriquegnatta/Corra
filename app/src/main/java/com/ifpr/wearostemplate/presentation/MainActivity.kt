package com.ifpr.wearostemplate.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.ifpr.wearostemplate.PerfilActivit
import com.ifpr.wearostemplate.R

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnStart)

        button.setOnClickListener {
            val intent = Intent(this, PerfilActivit::class.java)
            startActivity(intent)
        }
    }
}
