package main.com.smarthome.devices;

import main.com.smarthome.core.Device;

public class AbstractDevice implements Device {
    protected final String id;
    protected final String name;
    protected boolean isOn;
    protected int currPower;
    @Override
    public String getId() {
        return id;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void turnOn(){
        isOn = false;
    };

    @Override
    public void turnOff() {
         isOn = false;
    }

    @Override
    public boolean getIsOn() {
        return isOn;
    }

    @Override
    public int getCurrPower() {
        return 0;
    }

    public AbstractDevice (String id, String name, boolean isOn){
        this.id = id;
        this.name = name;
        this.isOn = isOn;
    }
}
