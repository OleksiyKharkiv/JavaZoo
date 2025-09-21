package main.com.smarthome.devices;

public class RegularDevice extends AbstractDevice{
    public RegularDevice ( String id, String name, boolean isOn, int powerConsumption){
        super( id, name, isOn, powerConsumption);
    }
    public String toString(){
        return "RegularDevice{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isOn=" + isOn +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
