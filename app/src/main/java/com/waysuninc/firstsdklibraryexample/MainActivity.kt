package com.waysuninc.firstsdklibraryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waysuninc.logutil.LogDebug

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogDebug.d("here is your LogDebug message")
    }
}