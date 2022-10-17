package com.sun.plugin;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.qihoo360.replugin.RePlugin;
import java.lang.reflect.Field;

/**
 * @author hengyangji
 *         on 2022/9/24
 */
public class SunPluginApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Log.i("SunPluginApplication", "attachBaseContext");
        loadHostServices();
    }

    private void loadHostServices() {
        Class<?> hostServicesClass = null;
        try {
            hostServicesClass = RePlugin.getHostClassLoader().loadClass("com.sun.replugin.HostServiceProvider");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Field servicesListField = null;
        try {
            servicesListField = hostServicesClass.getDeclaredField("services");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        if (servicesListField == null) {
            return;
        }
        servicesListField.setAccessible(true);
        try {
            Object obj = servicesListField.get(hostServicesClass);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
