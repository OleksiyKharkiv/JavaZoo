package main.com.smarthome.core;

public interface Device {
    String getId();

    String getName();

    void turnOn();

    void turnOff();

    boolean isOn();

    int getPowerConsumption();
    int getCurrPowerConsumption();
}

