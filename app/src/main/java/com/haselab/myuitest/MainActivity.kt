package com.haselab.myuitest

import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listener = MainButtonPush(this)
        val btChange = findViewById<Button>(R.id.bt_change)
        btChange.setOnClickListener(listener)
        val btClear = findViewById<Button>(R.id.bt_clear)
        btClear.setOnClickListener(listener)

        val mlv =  MainListView(this)
        mlv.setItem()
        val lvSample = findViewById<ListView>(R.id.lv_sample)

        lvSample.onItemClickListener = mlv

    }
}