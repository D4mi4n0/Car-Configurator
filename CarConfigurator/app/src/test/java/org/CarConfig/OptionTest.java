package org.CarConfig;

import org.CarConfig.Classes.OptionImpl;
import org.CarConfig.Interfaces.Option;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OptionTest {

    @Test
    void testOption() {
        Option option = new OptionImpl("Sunroof");
        assertEquals("Sunroof", option.getLabel());
    }
}
