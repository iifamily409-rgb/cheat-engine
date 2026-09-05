package com.cheat.engine
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        val btnProcess = Button(this)
        btnProcess.text = "Select Process"
        btnProcess.setOnClickListener { startActivity(Intent(this, ProcessListActivity::class.java)) }
        val btnScan = Button(this)
        btnScan.text = "Memory Scanner"
        btnScan.setOnClickListener { startActivity(Intent(this, ScanActivity::class.java)) }
        val btnOverlay = Button(this)
        btnOverlay.text = "Start Floating Overlay"
        btnOverlay.setOnClickListener { startService(Intent(this, FloatingService::class.java)) }
        layout.addView(btnProcess)
        layout.addView(btnScan)
        layout.addView(btnOverlay)
        setContentView(layout)
    }
}
