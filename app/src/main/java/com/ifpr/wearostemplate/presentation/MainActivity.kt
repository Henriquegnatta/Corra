package com.ifpr.wearostemplate.presentation

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.ifpr.wearostemplate.R
import com.ifpr.wearostemplate.PerfilActivit

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()

        super.onCreate(savedInstanceState)

        setTheme(android.R.style.Theme_DeviceDefault)

        setContentView(R.layout.activity_main)

        val btncorrida = findViewById<Button>(R.id.btnCorre)

        btncorrida.setOnClickListener {
            val intent = Intent(this, PerfilActivit::class.java)
            startActivity(intent)
        }
    }
}