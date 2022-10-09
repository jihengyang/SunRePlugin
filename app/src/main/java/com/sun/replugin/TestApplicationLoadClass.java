package com.sun.replugin;

import android.util.Log;

/**
 * @author hengyangji
 *         on 2022/10/9
 */
public class TestApplicationLoadClass {
    public static void load() {
        Log.i("TestAppLoadClass", "do load, classLoader:" + TestApplicationLoadClass.class.getClassLoader());
    }
}
