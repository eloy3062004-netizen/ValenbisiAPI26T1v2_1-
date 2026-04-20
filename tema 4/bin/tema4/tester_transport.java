package tema4;

import tema4.examen_prueba.Bus;
import tema4.examen_prueba.Taxi;

public class tester_transport {
    public static void main(String[] args) {
        Taxi taxi = new taxi("TX-1234", "Toyota Prius", 110, false, 5678, false);
        Bus bus = new Bus("BS-9876", "Mercedes Sprinter", 300, false, 42, 40);

        taxi.startService();
        bus.startService();

        System.out.println(taxi);
        System.out.println(bus);

        taxi.finishService();
        bus.finishService();
    }
}

