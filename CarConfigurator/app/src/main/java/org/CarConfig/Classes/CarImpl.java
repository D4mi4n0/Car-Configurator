package org.CarConfig.Classes;

import org.CarConfig.Interfaces.Car;
import org.CarConfig.Interfaces.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a standard car implementation in the car configuration system.
 */
public class CarImpl implements Car {
    private String brand;
    private double price;
    private String color;
    private Engine engine;
    private List<Wheel> wheels;
    private List<Option> options;

    /**
     * Constructs a CarImpl with the specified parameters.
     *
     * @param brand the brand of the car
     * @param price the price of the car
     * @param color the color of the car
     * @param engine the engine of the car
     * @param wheels the list of wheels of the car
     */
    public CarImpl(String brand, double price, String color, Engine engine, List<Wheel> wheels) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.engine = engine;
        this.wheels = wheels;
        this.options = new ArrayList<>();
    }

    /**
     * Returns the type of the car.
     *
     * @return the type of the car
     */
    @Override
    public String getCarType() {
        return "Standard";
    }

    /**
     * Returns the brand of the car.
     *
     * @return the brand of the car
     */
    @Override
    public String getBrand() {
        return brand;
    }

    /**
     * Returns the price of the car.
     *
     * @return the price of the car
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Returns the color of the car.
     *
     * @return the color of the car
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * Returns the engine of the car.
     *
     * @return the engine of the car
     */
    @Override
    public Engine getEngine() {
        return engine;
    }

    /**
     * Returns the list of wheels of the car.
     *
     * @return the list of wheels of the car
     */
    @Override
    public List<Wheel> getWheels() {
        return wheels;
    }

    /**
     * Returns the list of options of the car.
     *
     * @return the list of options of the car
     */
    @Override
    public List<Option> getOptions() {
        return options;
    }

    /**
     * Adds an option to the car.
     *
     * @param option the option to add
     */
    @Override
    public void addOptions(Option option) {
        options.add(option);
    }

    /**
     * Configures the car.
     */
    @Override
    public void configure() {
        // Auto Configuration
    }
}