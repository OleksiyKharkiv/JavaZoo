package com.smarthome.devices;

import com.smarthome.core.Device;

public abstract class AbstractDevice implements Device {
    private final String id;
    private final String name;
    private final int powerConsumption;
    private boolean isOn;

    public AbstractDevice(String id, String name, boolean isOn, int powerConsumption) {
        this.id = id;
        this.name = name;
        this.isOn = isOn;
        this.powerConsumption = this.getPowerConsumption();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public int getCurrPowerConsumption() {
        return isOn ? powerConsumption : 0;
    }
}