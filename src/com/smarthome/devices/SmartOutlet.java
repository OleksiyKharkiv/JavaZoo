package com.smarthome.devices;

public class SmartOutlet extends AbstractDevice {

    public SmartOutlet(String id, String name, boolean isOn, int powerConsumption) {
        super(id, name, isOn, powerConsumption);
    }

    public String toString() {
        return "SmartOutlet{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", isOn=" + isOn() +
                ", powerConsumption=" + getPowerConsumption() +
                '}';
    }
}
