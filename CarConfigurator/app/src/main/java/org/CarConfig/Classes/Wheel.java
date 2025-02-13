package org.CarConfig.Classes;

import org.CarConfig.Interfaces.Component;

/**
 * Represents a car wheel with a specific weight.
 */

public class Wheel implements Component {
    private double weight;

    /**
     * Constructs a new Wheel instance.
     *
     * @param weight the weight of the wheel
     */
    public Wheel(double weight) {
        this.weight = weight;
    }

    /**
     * Gets the details of the wheel.
     *
     * @return a string representing the wheel details
     */
    @Override
    public String getDetails() {
        return "Wheel with weight " + weight + " kg";
    }

    // Getters and setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
