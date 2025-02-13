package org.CarConfig.Classes;

import org.CarConfig.Interfaces.Car;
import org.CarConfig.Interfaces.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sports car with specific attributes.
 */
public class SportsCar implements Car {
    private String brand;
    private double price;
    private String color;
    private Engine engine;
    private List<Wheel> wheels;
    private double topSpeed;
    private List<Option> options;

    /**
     * Constructs a SportsCar with the specified parameters.
     *
     * @param brand the brand of the car
     * @param price the price of the car
     * @param color the color of the car
     * @param engine the engine of the car
     * @param wheels the list of wheels of the car
     * @param topSpeed the top speed of the car
     */
    public SportsCar(String brand, double price, String color, Engine engine, List<Wheel> wheels, double topSpeed) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.engine = engine;
        this.wheels = wheels;
        this.topSpeed = topSpeed;
        this.options = new ArrayList<>();
    }

    @Override
    public String getCarType() {
        return "Sports Car";
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public List<Option> getOptions() {
        return options;
    }

    @Override
    public void addOptions(Option option) {
        options.add(option);
    }

    @Override
    public void configure() {
        System.out.println("Configuring sports car: " + getBrand() + " with top speed: " + topSpeed + " km/h");
        // Additional sports car specific configuration logic
    }

    /**
     * Returns the top speed of the car.
     *
     * @return the top speed of the car
     */
    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
}