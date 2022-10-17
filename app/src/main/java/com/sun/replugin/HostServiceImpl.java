package com.sun.replugin;

/**
 * @author hengyangji
 *         on 2022/10/17
 */
public class HostServiceImpl implements IHostService{

    @Override
    public String readHostName() {
        return "SunHost";
    }
}
