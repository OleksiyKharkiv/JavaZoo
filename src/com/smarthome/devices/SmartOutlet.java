package com.smarthome.devices;

public class SmartOutlet extends AbstractDevice {
    private boolean isOverloaded;

    public SmartOutlet(String id, String name, boolean isOn, int powerConsumption) {
        super(id, name, isOn, powerConsumption);
        this.isOverloaded = false;
    }

    public String toString() {
        return "SmartOutlet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isOn=" + isOn +
                ", powerConsumption=" + powerConsumption +
                ", isOverloaded=" + isOverloaded +
                '}';
    }
}
