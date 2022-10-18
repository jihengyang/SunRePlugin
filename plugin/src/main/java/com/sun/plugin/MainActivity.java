package com.sun.plugin;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.qihoo360.replugin.loader.a.PluginActivity;

public class MainActivity extends PluginActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plugin_main);
        TextView text = findViewById(R.id.text);
        text.setText(Build.MANUFACTURER);
        Log.i("MyPlugin", "classLoader:" + getClassLoader());
    }
}