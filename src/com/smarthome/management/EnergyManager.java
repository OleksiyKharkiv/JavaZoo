package com.smarthome.management;

import com.smarthome.core.Device;

import java.util.List;

public class EnergyManager {
    private final List<Device> devices;
    private final int maxGridPower;

    public EnergyManager (List<Device> devices, int maxGridPower){
        this.devices = devices;
        this.maxGridPower = maxGridPower;
    }
    public int getCurrTotalPowerConsumption() {
        return devices.stream()
                .mapToInt(Device::getCurrPowerConsumption)
                .sum();
    }
    public boolean isGridOverloaded() {
        return getCurrTotalPowerConsumption() > maxGridPower;
    }

}
