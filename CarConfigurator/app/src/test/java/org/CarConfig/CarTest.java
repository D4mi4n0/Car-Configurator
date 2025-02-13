package org.CarConfig;

import org.CarConfig.Classes.Engine;
import org.CarConfig.Classes.LuxuryCar;
import org.CarConfig.Classes.Wheel;
import org.CarConfig.Interfaces.Car;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class CarTest {
    @Test
    void testCarCreation() {
        Engine engine = new Engine(200);
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel(20));
        wheels.add(new Wheel(20));
        wheels.add(new Wheel(20));
        wheels.add(new Wheel(20));

        Car car = new LuxuryCar("Toyota", 30000, "Red", engine, wheels, "Sunroof");
        assertEquals("Toyota", car.getBrand());
        assertEquals(30000, car.getPrice());
        assertEquals("Red", car.getColor());
        assertEquals(engine, car.getEngine());
        assertEquals(4, car.getWheels().size());
        assertEquals("Sunroof", ((LuxuryCar) car).getLuxuryFeature());
    }
}