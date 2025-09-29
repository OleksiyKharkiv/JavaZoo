package com.smarthome.factory;

import com.smarthome.devices.SmartLight;
import com.smarthome.devices.SmartOutlet;

public class DeviceFactory {
    public SmartLight createSmartLight(String name, boolean isOn, int powerConsumption) {
        return new SmartLight(generateId(), name, isOn, powerConsumption);
    }

    public SmartOutlet createSmartOutlet(String name, boolean isOn, int powerConsumption) {
        return new SmartOutlet(generateId(), name, isOn, powerConsumption);
    }

    private static String generateId() {
        return "dev_" + System.currentTimeMillis() + "_" + (int) (Math.random() * 1000);
    }
}
