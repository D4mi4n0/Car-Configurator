package org.CarConfig.Classes;

import org.CarConfig.Interfaces.Component;

/**
 * Represents a car engine with specific horsepower.
 */

public class Engine implements Component {
    private double horsePower;

    /**
     * Constructs a new Engine instance.
     *
     * @param horsePower the horsepower of the engine
     */

    public Engine(double horsePower) {
        this.horsePower = horsePower;
    }

    /**
     * Gets the details of the engine.
     *
     * @return a string representing the engine details
     */
    @Override
    public String getDetails() {
        return "Engine with " + horsePower + " HP";
    }

    // Getters and setters
    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }
}
