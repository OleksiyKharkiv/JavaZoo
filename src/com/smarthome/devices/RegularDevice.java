package com.smarthome.devices;

public class RegularDevice extends AbstractDevice{
    public RegularDevice ( String id, String name, boolean isOn, int powerConsumption){
        super( id, name, isOn, powerConsumption);
    }
    public String toString(){
        return "RegularDevice{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", isOn=" + isOn() +
                ", powerConsumption=" + getPowerConsumption() +
                '}';
    }
}
