package org.CarConfig.Interfaces;

import org.CarConfig.Classes.Engine;
import org.CarConfig.Classes.Wheel;

import java.util.List;

/**
 * Represents a car in the car configuration system.
 */
public interface Car {
    /**
     * Returns the type of the car.
     *
     * @return the type of the car
     */
    String getCarType();

    /**
     * Returns the brand of the car.
     *
     * @return the brand of the car
     */
    String getBrand();

    /**
     * Returns the price of the car.
     *
     * @return the price of the car
     */
    double getPrice();

    /**
     * Returns the color of the car.
     *
     * @return the color of the car
     */
    String getColor();

    /**
     * Returns the engine of the car.
     *
     * @return the engine of the car
     */
    Engine getEngine();

    /**
     * Returns the list of wheels of the car.
     *
     * @return the list of wheels of the car
     */
    List<Wheel> getWheels();

    /**
     * Returns the list of options of the car.
     *
     * @return the list of options of the car
     */
    List<Option> getOptions();

    /**
     * Adds an option to the car.
     *
     * @param option the option to add
     */
    void addOptions(Option option);

    /**
     * Configures the car.
     */
    void configure();
}