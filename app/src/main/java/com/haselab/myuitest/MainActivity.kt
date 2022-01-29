package com.haselab.myuitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listener = MainButtonPush(this)
        val btChange = findViewById<Button>(R.id.bt_change)
        btChange.setOnClickListener(listener)
        val btClear = findViewById<Button>(R.id.bt_clear)
        btClear.setOnClickListener(listener)


    }
}