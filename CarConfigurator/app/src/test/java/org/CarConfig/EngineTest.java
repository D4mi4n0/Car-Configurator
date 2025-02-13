package org.CarConfig;

import org.CarConfig.Classes.Engine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @Test
    void testEngineDetails() {
        Engine engine = new Engine(450);
        assertEquals(450, engine.getHorsePower());
        assertEquals("Engine with 450.0 HP", engine.getDetails());
    }
}