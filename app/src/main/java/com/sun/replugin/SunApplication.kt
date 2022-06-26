package com.sun.replugin

import android.app.Application
import android.content.Context
import android.util.Log

/**
 * Created by hengyangji on 2022/6/20
 */
class SunApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        Log.i("SunApplication", "attachBaseContext")
    }

    override fun onCreate() {
        super.onCreate()
        Log.i("SunApplication", "onCreate")
    }
}