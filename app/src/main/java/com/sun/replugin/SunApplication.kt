package com.sun.replugin

import android.content.Context
import android.util.Log
import com.qihoo360.replugin.RePluginApplication

/**
 * Created by hengyangji on 2022/6/20
 */
class SunApplication : RePluginApplication() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        Log.i("SunApplication", "attachBaseContext")
    }

    override fun onCreate() {
        super.onCreate()
        Log.i("SunApplication", "onCreate")
    }
}