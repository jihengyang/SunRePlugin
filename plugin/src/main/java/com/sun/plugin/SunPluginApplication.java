package com.sun.plugin;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * @author hengyangji
 *         on 2022/9/24
 */
public class SunPluginApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Log.i("SunPluginApplication", "attachBaseContext");
    }
}
