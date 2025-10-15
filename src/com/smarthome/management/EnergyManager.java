package com.smarthome.management;

import com.smarthome.core.Device;

import java.util.List;

public record EnergyManager(List<Device> devices, int maxGridPower) {

    public EnergyManager(List<Device> devices, int maxGridPower) {
        this.devices = devices;
        this.maxGridPower = maxGridPower;
    }

    public int getCurrTotalPowerConsumption() {
        return devices.stream().mapToInt(Device::getCurrPowerConsumption).sum();
    }

    public boolean isGridOverloaded() {
        return getCurrTotalPowerConsumption() > maxGridPower;
    }

    public void autoDiableDevices() {
        Device maxDevice = null;
        for (Device device : devices) {
            if (device.isOn() && (maxDevice == null || device.getCurrPowerConsumption() > maxDevice.getCurrPowerConsumption())) {
                maxDevice = device;
            }
        }
        if (maxDevice != null) {
            maxDevice.turnOff();
        }
    }
}