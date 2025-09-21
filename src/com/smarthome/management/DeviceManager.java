package com.smarthome.management;

import com.smarthome.core.Device;

import java.util.ArrayList;
import java.util.List;

public class DeviceManager {
    private final List<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println("Device added: " + device.getName());
    }

    public List<Device> getDevices() {
        return new ArrayList<>(devices);
    }

    public void turnDeviceById(String id) {
        for (Device device : devices) {
            if (device.getId().equals(id)) {
                device.turnOn();
            }
        }
    }

    public void turnOffDeviceById(String id) {
        for (Device device : devices) {
            if (device.getId().equals(id)) {
                device.turnOff();
            }
        }
    }

}
