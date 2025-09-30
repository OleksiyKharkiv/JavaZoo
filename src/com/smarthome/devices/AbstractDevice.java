package com.smarthome.devices;

import com.smarthome.core.Device;

public abstract class AbstractDevice implements Device {
    private final String id;
    private final String name;
    private final int powerConsumption;
    private boolean isOn;

    public AbstractDevice(String id, String name, boolean isOn, int powerConsumption) {
        if (id == null || id.isEmpty()) throw new IllegalArgumentException("Device id cannot be null or empty");
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Device name cannot be null or empty");
        if (powerConsumption < 0) throw new IllegalArgumentException("Device power consumption cannot be negative");
        this.id = id;
        this.name = name;
        this.isOn = isOn;
        this.powerConsumption = powerConsumption;
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

    @Override
    public String toString() {
        return "AbstractDevice{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", isOn=" + isOn() +
                ", powerConsumption=" + getPowerConsumption() +
                '}';
    }
}