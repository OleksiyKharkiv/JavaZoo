package com.smarthome.devices;

public class SmartOutlet extends AbstractDevice {
    private boolean isOverloaded = false;

    public SmartOutlet(String id, String name, boolean isOn, int powerConsumption) {
        super(id, name, isOn, powerConsumption);
    }

    public void setOverloaded(boolean overloaded) {
        isOverloaded = overloaded;
    }

    public boolean isOverloaded() {
        return isOverloaded;
    }
}
