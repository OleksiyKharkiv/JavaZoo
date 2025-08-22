import java.util.Random;

public class Sensor {
    private int id;
    private int deviceId;
    private String sensorName;
    private String sensorType;

    public Sensor(int deviceId, String sensorName, String sensorType) {
        this.deviceId = deviceId;
        this.sensorName = sensorName;
        this.sensorType = sensorType;
    }

    public int getId() {
        return id;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public String getSensorType() {
        return sensorType;
    }

    public boolean checkSafety() {
        return new Random().nextInt(100) > 90;
    }
}