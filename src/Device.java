public class Device {
    private String deviceName;
    private boolean isOn;
    private int power;

    public Device(String deviceName, int power) {
        this.deviceName = deviceName;
        this.isOn = false;
        this.power = power;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public int getCurrPower (){
        return isOn ? power : 0;
    }

    public static void main(String[] args) {
        Device lamp = new Device("Lamp", 100);
        Device conditioner = new Device("Conditioner", 1500);

        lamp.turnOn();
        conditioner.turnOn();
        lamp.turnOff();
        int consumption = lamp.getCurrPower() + conditioner.getCurrPower();
        System.out.println("Lamps is: " + (lamp.isOn ? "[ON]" : "[OFF]"));
        System.out.println("Conditioner is: " + (conditioner.isOn ? "[ON]" : "[OFF]"));
        System.out.println("Total consumption: " + consumption + " Watts");
    }
}