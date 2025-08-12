import java.util.List;

public class PowerGrid {
    private List<Device> devices;
    private final int MAX_POWER = 3000;
    public void addDevice(Device device){
        devices.add(device);
    }
    public int getTotalPower(){
        int totalPower = 0;
        for(Device device: devices){
            totalPower += device.getCurrPower();
        }
        return totalPower;
    }
    public int getMostPowerfulDevId (List<Device> devices){
        int maxPowerId = 0;
        int maxPower = devices.get(0).getCurrPower();
        int left = 0;
        int right = devices.size() - 1;
        while (left < right){
            if (devices.get(left).getCurrPower() > maxPower){
             maxPowerId = left;
             maxPower = devices.get(left).getCurrPower();
            }
            if (devices.get(right).getCurrPower() > maxPower){
                maxPowerId = right;
                maxPower = devices.get(right).getCurrPower();
            }
            left++;
            right--;
        }
        return maxPowerId;
    }
    public void checkSafety (){
        if (getTotalPower() > MAX_POWER){
            while (getTotalPower() > MAX_POWER){
                Device device = devices.get(getMostPowerfulDevId(devices));
                 device.turnOff();
            }
        }
    }
}
