package com.sun.plugin;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.qihoo360.replugin.loader.a.PluginActivity;

public class MainActivity extends PluginActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plugin_main);
        Log.i("MyPlugin", "classLoader:" + getClassLoader());
    }
}