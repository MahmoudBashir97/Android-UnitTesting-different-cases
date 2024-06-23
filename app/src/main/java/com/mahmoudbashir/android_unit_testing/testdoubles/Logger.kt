package com.mahmoudbashir.android_unit_testing.testdoubles

import android.util.Log

class Logger {
    fun log(message: String) {
        Log.d("", message)
    }
}