public class Device {
    String deviceName;
    boolean isOn;
    int power;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
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

    public static void main(String[] args) {
        Device lamp = new Device();
        Device conditioner = new Device();
        lamp.setPower(100);
        conditioner.setPower(1500);
        lamp.turnOn();
        conditioner.turnOff();
    }


}