package main.com.smarthome.devices;

import main.com.smarthome.core.Device;

public abstract class AbstractDevice implements Device {
    protected final String id;
    protected final String name;
    protected final int powerConsumption;
    protected boolean isOn;

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
        isOn = false;
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
    public int getCurrPower() {
        return 0;
    }


}
