import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Device lamp = new Device("Lamp", 100);
        Device conditioner = new Device("Conditioner", 1500);
        Device kettle = new Device("Kettle", 1000);

        lamp.turnOn();
        conditioner.turnOn();
        kettle.turnOn();

        List<Device> devList = new ArrayList<>();
        devList.add(lamp);
        devList.add(conditioner);
        devList.add(kettle);

        for (Device dev : devList) {
            System.out.println(dev.getDeviceName() + " is " + (dev.getIsOn() ? "on" : "off"));
        }
    }
}