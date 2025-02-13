package org.CarConfig;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import org.CarConfig.Classes.*;
import org.CarConfig.Interfaces.Car;
import java.util.List;

/**
 * Creates a car based on the provided inputs.
 */
public class CreateCar {

    private ChoiceBox<String> carTypeChoice; private TextField brandInput;
    private TextField priceInput; private TextField colorInput;
    private TextField horsepowerInput; private TextField distinctiveFeatureInput;
    private ChoiceBox<String> luxuryFeatureChoice; private List<Wheel> wheels;
    private Car car;

    /**
     * Constructs a CreateCar with the provided inputs.
     *
     * @param carTypeChoice the choice box for selecting the car type
     * @param brandInput the text field for entering the car brand
     * @param priceInput the text field for entering the car price
     * @param colorInput the text field for entering the car color
     * @param horsepowerInput the text field for entering the car horsepower
     * @param distinctiveFeatureInput the text field for entering the distinctive feature
     * @param luxuryFeatureChoice the choice box for selecting the luxury feature
     * @param wheels the list of wheels
     */
    public CreateCar(ChoiceBox<String> carTypeChoice, TextField brandInput, TextField priceInput, TextField colorInput, TextField horsepowerInput, TextField distinctiveFeatureInput, ChoiceBox<String> luxuryFeatureChoice, List<Wheel> wheels) {
        this.carTypeChoice = carTypeChoice; this.brandInput = brandInput;
        this.priceInput = priceInput; this.colorInput = colorInput;
        this.horsepowerInput = horsepowerInput; this.distinctiveFeatureInput = distinctiveFeatureInput;
        this.luxuryFeatureChoice = luxuryFeatureChoice; this.wheels = wheels;
    }

    /**
     * Creates a car based on the provided inputs.
     *
     * @return the created car
     */
    public Car createCar() {
        String carType = carTypeChoice.getValue(); String brand = brandInput.getText();
        double price = Double.parseDouble(priceInput.getText()); String color = colorInput.getText();
        int horsepower = Integer.parseInt(horsepowerInput.getText()); Engine engine = new Engine(horsepower);
        String distinctiveFeature = distinctiveFeatureInput.getText();
        return createCarByType(carType, brand, price, color, engine, distinctiveFeature);
    }

    private Car createCarByType(String carType, String brand, double price, String color, Engine engine, String distinctiveFeature) {
        switch (carType) {
            case "Luxury Car":
                String luxuryFeature = luxuryFeatureChoice.getValue();
                if (luxuryFeature == null) throw new IllegalArgumentException("Luxury feature is required.");
                return new LuxuryCar(brand, price, color, engine, wheels, luxuryFeature);
            case "Sports Car":
                double topSpeed = Double.parseDouble(distinctiveFeature);
                if (topSpeed < 200 || topSpeed > 400) throw new IllegalArgumentException("Top speed must be between 200 and 400.");
                return new SportsCar(brand, price, color, engine, wheels, topSpeed);
            case "Electric Car":
                double batteryCapacity = Double.parseDouble(distinctiveFeature);
                if (batteryCapacity < 50 || batteryCapacity > 100) throw new IllegalArgumentException("Battery capacity must be between 50 and 100.");
                return new ElectricCar(brand, price, color, engine, wheels, batteryCapacity);
            default:
                throw new IllegalArgumentException("Invalid car type.");
        }
    }
}