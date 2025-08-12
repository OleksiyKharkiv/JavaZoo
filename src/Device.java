public class Device {
    private int id;
    private final String deviceName;
    private boolean isOn;
    private boolean isSafe;
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

    public int getCurrPower() {
        return isOn ? power : 0;
    }

    public boolean updateSafety(boolean isSafe) {
        return isSafe;
    }
}