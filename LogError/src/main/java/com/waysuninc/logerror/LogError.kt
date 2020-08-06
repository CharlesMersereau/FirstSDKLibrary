package com.waysuninc.logerror

import android.util.Log

object LogError {
    private val TAG = "Custom LogError Tag"

    fun e(message: String) {
        Log.d(TAG, message)
    }
}