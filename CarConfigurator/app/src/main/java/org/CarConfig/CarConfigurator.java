package org.CarConfig;

import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import org.CarConfig.Classes.*;
import org.CarConfig.Interfaces.Car;
import org.CarConfig.Interfaces.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles the car configuration process.
 */
public class CarConfigurator {

    private ChoiceBox<String> carTypeChoice; private TextField brandInput;
    private TextField priceInput; private TextField colorInput;
    private TextField horsepowerInput; private TextField wheelsInput;
    private List<TextField> wheelWeightInputs; private CheckBox airConditioning;
    private CheckBox leatherSeats; private CheckBox sunroof;
    private ChoiceBox<String> materialChoice; private TextField distinctiveFeatureInput;
    private ChoiceBox<String> luxuryFeatureChoice;

    private Car car;
    private List<Option> selectedOptions = new ArrayList<>();
    private List<Wheel> wheels = new ArrayList<>();

    /**
     * Constructs a CarConfigurator with the provided inputs.
     *
     * @param carTypeChoice the choice box for selecting the car type
     * @param brandInput the text field for entering the car brand
     * @param priceInput the text field for entering the car price
     * @param colorInput the text field for entering the car color
     * @param horsepowerInput the text field for entering the car horsepower
     * @param wheelsInput the text field for entering the number of wheels
     * @param wheelWeightInputs the list of text fields for entering the weights of the wheels
     * @param airConditioning the checkbox for selecting air conditioning
     * @param leatherSeats the checkbox for selecting leather seats
     * @param sunroof the checkbox for selecting a sunroof
     * @param materialChoice the choice box for selecting the material
     * @param distinctiveFeatureInput the text field for entering the distinctive feature
     * @param luxuryFeatureChoice the choice box for selecting the luxury feature
     */
    public CarConfigurator(ChoiceBox<String> carTypeChoice, TextField brandInput, TextField priceInput, TextField colorInput, TextField horsepowerInput, TextField wheelsInput, List<TextField> wheelWeightInputs, CheckBox airConditioning, CheckBox leatherSeats, CheckBox sunroof, ChoiceBox<String> materialChoice, TextField distinctiveFeatureInput, ChoiceBox<String> luxuryFeatureChoice) {
        this.carTypeChoice = carTypeChoice; this.brandInput = brandInput;
        this.priceInput = priceInput; this.colorInput = colorInput;
        this.horsepowerInput = horsepowerInput; this.wheelsInput = wheelsInput;
        this.wheelWeightInputs = wheelWeightInputs; this.airConditioning = airConditioning;
        this.leatherSeats = leatherSeats; this.sunroof = sunroof;
        this.materialChoice = materialChoice; this.distinctiveFeatureInput = distinctiveFeatureInput;
        this.luxuryFeatureChoice = luxuryFeatureChoice;
    }

    /**
     * Handles the submission of the car configuration.
     * Validates the inputs, creates the car, adds options, and shows a success alert.
     */
    public void handleSubmit() {
        try { validateInputs();
            CreateCar createCar = new CreateCar(carTypeChoice, brandInput, priceInput, colorInput, horsepowerInput, distinctiveFeatureInput, luxuryFeatureChoice, wheels);
            car = createCar.createCar(); addOptionsToCar();
            car.configure(); showSuccessAlert(); }
        catch (NumberFormatException ex) { showError("Invalid number format. Please enter valid numbers."); }
        catch (IllegalArgumentException ex) { showError(ex.getMessage()); }
    }

    private void validateInputs() {
        if (carTypeChoice.getValue() == null) throw new IllegalArgumentException("Car type is required.");
        if (brandInput.getText().isEmpty()) throw new IllegalArgumentException("Car brand is required.");
        if (priceInput.getText().isEmpty() || !isValidPrice(priceInput.getText()))
            throw new IllegalArgumentException("Price must be between 10000 and 200000.");
        if (colorInput.getText().isEmpty()) throw new IllegalArgumentException("Car color is required.");
        if (horsepowerInput.getText().isEmpty() || !isValidHorsepower(horsepowerInput.getText()))
            throw new IllegalArgumentException("Horsepower must be between 100 and 500.");
        if (wheelsInput.getText().isEmpty() || !isValidWheels(wheelsInput.getText()))
            throw new IllegalArgumentException("Number of wheels must be between 1 and 4.");
        validateWheelWeights();
    }

    private boolean isValidPrice(String priceText) {
        double price = Double.parseDouble(priceText);
        return price >= 10000 && price <= 200000;
    }

    private boolean isValidHorsepower(String horsepowerText) {
        int horsepower = Integer.parseInt(horsepowerText);
        return horsepower >= 100 && horsepower <= 500;
    }

    private boolean isValidWheels(String wheelsText) {
        int numberOfWheels = Integer.parseInt(wheelsText);
        return numberOfWheels >= 1 && numberOfWheels <= 4;
    }

    private void validateWheelWeights() {
        for (TextField wheelWeightInput : wheelWeightInputs) {
            String weightText = wheelWeightInput.getText();
            int weight = Integer.parseInt(weightText);
            if (weight < 6 || weight > 10) throw new IllegalArgumentException("Wheel weight must be between 6 and 10.");
            wheels.add(new Wheel(weight));
        }
    }

    private void addOptionsToCar() {
        if (airConditioning.isSelected()) selectedOptions.add(new BasicOption("Air Conditioning"));
        if (leatherSeats.isSelected()) selectedOptions.add(new BasicOption("Leather Seats"));
        if (sunroof.isSelected()) selectedOptions.add(new BasicOption("Sunroof"));
        for (Option option : selectedOptions) { car.addOptions(option); }
        if (materialChoice.getValue() != null) { car.addOptions(new Material(materialChoice.getValue())); }
    }

    private void showSuccessAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Car Configuration Complete");
        alert.setHeaderText(null);
        alert.setContentText("Car configuration complete:\n" + "Type: " + car.getCarType() + "\n" +
                "Brand: " + car.getBrand() + "\n" + "Price: " + car.getPrice() + " USD\n" +
                "Color: " + car.getColor() + "\n" + "Engine: " + car.getEngine().getDetails() + "\n" +
                "Wheels: " + car.getWheels().size() + "\n" + "Options: " + car.getOptions().size());
        alert.showAndWait();
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}