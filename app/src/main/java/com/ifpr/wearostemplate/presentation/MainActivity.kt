/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter to find the
 * most up to date changes to the libraries and their usages.
 */

package com.ifpr.wearostemplate.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.ifpr.wearostemplate.R
import com.ifpr.wearostemplate.presentation.theme.corrida
import android.content.Intent
import android.widget.Button

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()

        super.onCreate(savedInstanceState)

        setTheme(android.R.style.Theme_DeviceDefault)

        setContentView(R.layout.activity_main)
        val btncorrida = findViewById<Button>(R.id.btnCorre)

        btncorrida.setOnClickListener {
            val intent = Intent(this, corrida::class.java)
            startActivity(intent)
        }
    }
}

