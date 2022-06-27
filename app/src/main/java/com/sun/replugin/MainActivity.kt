package com.sun.replugin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.qihoo360.replugin.RePlugin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.start_plugin_btn).setOnClickListener {

            // 刻意以“包名”来打开
            RePlugin.startActivity(
                this@MainActivity,
                RePlugin.createIntent(
                    "com.sun.plugin",
                    "com.sun.plugin.MainActivity"
                )
            )
        }
    }
}