package org.CarConfig.Classes;

import org.CarConfig.Interfaces.Car;
import org.CarConfig.Interfaces.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an electric car in the car configuration system.
 */
public class ElectricCar implements Car {
    private String brand;
    private double price;
    private String color;
    private Engine engine;
    private List<Wheel> wheels;
    private double batteryCapacity;
    private List<Option> options;

    /**
     * Constructs an ElectricCar with the specified parameters.
     *
     * @param brand the brand of the car
     * @param price the price of the car
     * @param color the color of the car
     * @param engine the engine of the car
     * @param wheels the list of wheels of the car
     * @param batteryCapacity the battery capacity of the car
     */
    public ElectricCar(String brand, double price, String color, Engine engine, List<Wheel> wheels, double batteryCapacity) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.engine = engine;
        this.wheels = wheels;
        this.batteryCapacity = batteryCapacity;
        this.options = new ArrayList<>();
    }

    @Override
    public String getCarType() {
        return "Electric Car";
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
        System.out.println("Configuring electric car: " + getBrand());
        // Additional electric car specific configuration logic
    }

    /**
     * Returns the battery capacity of the car.
     *
     * @return the battery capacity of the car
     */
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
