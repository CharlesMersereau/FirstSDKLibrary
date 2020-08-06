package com.waysuninc.logutil

import android.util.Log

object LogDebug {
    private val TAG = "SUPER_AWESOME_APP"

    fun d(message: String) {
        Log.d(TAG, message)
    }
}