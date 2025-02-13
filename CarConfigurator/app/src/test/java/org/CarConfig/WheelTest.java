package org.CarConfig;

import org.CarConfig.Classes.Wheel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WheelTest {

    @Test
    void testWheelDetails() {
        Wheel wheel = new Wheel(20);
        assertEquals(20, wheel.getWeight());
        assertEquals("Wheel with weight 20.0 kg", wheel.getDetails());
    }
}
