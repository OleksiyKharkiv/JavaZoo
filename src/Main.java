import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PowerGrid grid = new PowerGrid();
        Device lamp = new Device("Lamp", 100);
        Device conditioner1 = new Device("Conditioner", 1500);
        Device conditioner2 = new Device("Conditioner", 1500);
        Device kettle = new Device("Kettle", 1000);

        lamp.turnOn();
        conditioner1.turnOn();
        conditioner2.turnOn();
        kettle.turnOn();

        grid.addDevice(lamp);
        grid.addDevice(conditioner1);
        grid.addDevice(conditioner2);
        grid.addDevice(kettle);

        System.out.println("======= The System started ======= ");

        printStatus(grid, kettle, conditioner2, conditioner2, lamp);

        Random rand = new Random();
        for (int i = 1; i < 6; i++) {
            Thread.sleep(5000);
            if (rand.nextDouble() < 0.3) {
                System.out.println("\n[Датчик] Обнаружен перегрев чайника!");
                kettle.updateSafety(false); // Помечаем как небезопасный → выключится автоматически
            }

            // Проверка безопасности сети (автоматический вызов при перегрузке)
            grid.checkSafety();
            System.out.printf("\n=== Состояние через %d сек. ===\n", i * 5);
            printStatus(grid, kettle, conditioner1, conditioner2, lamp);

        }
    }

    private static void printStatus(PowerGrid grid, Device... devices) {
        for (Device device : devices) {
            String status = device.getIsOn() ? "ON" : "OFF";
            String safety = device.updateSafety(true) ? "SAFE" : "DANGEROUS";
            System.out.printf("[%s]: %s | %s | Потребление: %d Вт\n",
                    device.getDeviceName(),
                    status,
                    safety,
                    device.getCurrPower()
            );
        }
        System.out.println("Total consumed power: = " + grid.getTotalPower() + "W");
        System.out.println("======================================== ");
    }
}