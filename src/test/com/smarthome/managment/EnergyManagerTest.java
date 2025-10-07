package test.com.smarthome.managment;

import com.smarthome.core.Device;
import com.smarthome.devices.SmartOutlet;
import com.smarthome.management.EnergyManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnergyManagerTest {
    void shouldDisableDevicesWhenGridOverloaded() {
        //Given
        List<Device> devices = Arrays.asList(
                new SmartOutlet("outlet1", "Outlet1", true, 2000),
                new SmartOutlet("outlet2", "Outlet2", true, 1500)
        );
        EnergyManager energyManager = new EnergyManager(devices, 1200);
        
        //when
        devices.forEach(Device::turnOn);
        energyManager.autoDiableDevices();
        
        //then
        assertFalse(energyManager.isGridOverloaded());
        assertEquals(500, energyManager.getCurrTotalPowerConsumption());
    }

    private void assertEquals(int i, int currTotalPowerConsumption) {
    }

    private void assertFalse(boolean gridOverloaded) {
        
    }
}
