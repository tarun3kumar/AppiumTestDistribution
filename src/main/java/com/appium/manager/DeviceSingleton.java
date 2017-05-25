package com.appium.manager;

/**
 * Created by saikrisv on 18/05/17.
 */
public class DeviceSingleton {

    public static DeviceSingleton instance;
    public static DeviceAllocationManager deviceID = null;

    public static DeviceSingleton getInstance() {
        if (instance == null) {
            instance = new DeviceSingleton();
            deviceID = DeviceAllocationManager.getInstance();
        }
        return instance;
    }

    public String getDeviceUDID() {
        return deviceID.getNextAvailableDeviceId();
    }
}
