package test.com.smarthome.managment;

import com.smarthome.core.Device;
import com.smarthome.devices.SmartOutlet;
import com.smarthome.management.EnergyManager;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EnergyManagerTest {
    @Test
    void shouldDisableDevicesWhenGridOverloaded() {
        //Given
        List<Device> devices = Arrays.asList(new SmartOutlet("outlet1", "Outlet1", true, 2000), new SmartOutlet("outlet2", "Outlet2", true, 1500));
        EnergyManager energyManager = new EnergyManager(devices, 1200);

        //when
        devices.forEach(Device::turnOn);
        energyManager.autoDiableDevices();

        //then
        assertFalse(energyManager.isGridOverloaded());
        assertEquals(500, energyManager.getCurrTotalPowerConsumption());
    }

}
