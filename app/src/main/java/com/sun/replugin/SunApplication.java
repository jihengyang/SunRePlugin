package com.sun.replugin;

import android.content.Context;
import com.qihoo360.replugin.RePluginApplication;

/**
 * Created by hengyangji on 2022/6/27
 */
public class SunApplication extends RePluginApplication {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        TestApplicationLoadClass.load();
        HostServiceProvider.services.clear();
        HostServiceProvider.services.add(new HostServiceImpl());
    }
}
