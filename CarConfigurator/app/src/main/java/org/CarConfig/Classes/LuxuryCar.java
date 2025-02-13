package org.CarConfig.Classes;

import org.CarConfig.Interfaces.Car;
import org.CarConfig.Interfaces.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a luxury car in the car configuration system.
 */
public class LuxuryCar implements Car {
    private String brand;
    private double price;
    private String color;
    private Engine engine;
    private List<Wheel> wheels;
    private String luxuryFeature;
    private List<Option> options;

    /**
     * Constructs a LuxuryCar with the specified parameters.
     *
     * @param brand the brand of the car
     * @param price the price of the car
     * @param color the color of the car
     * @param engine the engine of the car
     * @param wheels the list of wheels of the car
     * @param luxuryFeature the luxury feature of the car
     */
    public LuxuryCar(String brand, double price, String color, Engine engine, List<Wheel> wheels, String luxuryFeature) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.engine = engine;
        this.wheels = wheels;
        this.luxuryFeature = luxuryFeature;
        this.options = new ArrayList<>();
    }

    @Override
    public String getCarType() {
        return "Luxury Car";
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
        System.out.println("Configuring luxury car: " + getBrand() + " with feature: " + luxuryFeature);
        // Additional luxury car specific configuration logic
    }

    /**
     * Returns the luxury feature of the car.
     *
     * @return the luxury feature of the car
     */
    public String getLuxuryFeature() {
        return luxuryFeature;
    }

    public void setLuxuryFeature(String luxuryFeature) {
        this.luxuryFeature = luxuryFeature;
    }
}
