package com.smarthome.devices;

public class SmartLight extends AbstractDevice {
    public SmartLight(String id, String name, boolean isOn, int powerConsumption) {
        super(id, name, isOn, powerConsumption);
    }

    public String toString() {
        return "SmartLight{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", isOn=" + isOn() +
                ", powerConsumption=" + getPowerConsumption() +
                '}';
    }
}
