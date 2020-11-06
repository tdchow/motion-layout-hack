package com.example.motionlayouthack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.triangleExampleButton).setOnClickListener {
            startActivity(Intent(this, TriangleExampleActivity::class.java))
        }

        findViewById<Button>(R.id.widgetExampleButton).setOnClickListener {
            startActivity(Intent(this, WidgetExampleActivity::class.java))
        }
    }
}