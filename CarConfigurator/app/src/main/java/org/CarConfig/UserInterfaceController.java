package org.CarConfig;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller class for the user interface of the car configurator.
 */
public class UserInterfaceController {

    @FXML private GridPane grid;
    @FXML private ChoiceBox<String> carTypeChoice;
    @FXML private TextField brandInput;
    @FXML private TextField priceInput;
    @FXML private TextField colorInput;
    @FXML private TextField horsepowerInput;
    @FXML private TextField wheelsInput;
    @FXML private Button resetWheelsButton;
    @FXML private CheckBox airConditioning;
    @FXML private CheckBox leatherSeats;
    @FXML private CheckBox sunroof;
    @FXML private ChoiceBox<String> materialChoice;
    @FXML private Label distinctiveFeatureLabel;
    @FXML private TextField distinctiveFeatureInput;
    @FXML private ChoiceBox<String> luxuryFeatureChoice;
    @FXML private Button submitButton;
    @FXML private Button resetAllButton;

    private List<TextField> wheelWeightInputs = new ArrayList<>();

    /**
     * Initializes the controller class. This method is automatically called
     * after the FXML file has been loaded.
     */
    @FXML
    public void initialize() {
        carTypeChoice.getItems().addAll("Luxury Car", "Sports Car", "Electric Car");
        luxuryFeatureChoice.getItems().addAll("Seat massage system", "Virtual assistant");
        materialChoice.getItems().addAll("Carbon Fiber", "Alcantara");
        carTypeChoice.setOnAction(e -> handleCarTypeSelection());
        WheelsHandler wheelsHandler = new WheelsHandler(wheelsInput, wheelWeightInputs, grid);
        wheelsInput.textProperty().addListener((observable, oldValue, newValue) -> wheelsHandler.handleWheelsInput(newValue));
        resetWheelsButton.setOnAction(e -> handleResetWheels());
        resetAllButton.setOnAction(e -> handleResetAll());
        submitButton.setOnAction(e -> handleSubmit());
    }

    private void handleCarTypeSelection() {
        String carType = carTypeChoice.getValue();
        distinctiveFeatureInput.clear();
        grid.getChildren().remove(luxuryFeatureChoice);
        if ("Luxury Car".equals(carType)) { distinctiveFeatureLabel.setText("Select luxury feature:");
            grid.getChildren().add(luxuryFeatureChoice); }
        else if ("Sports Car".equals(carType)) { distinctiveFeatureLabel.setText("Enter top speed (200 - 400):"); }
        else if ("Electric Car".equals(carType)) { distinctiveFeatureLabel.setText("Enter battery capacity (50 - 100):"); }
    }

    private void handleResetWheels() {
        wheelsInput.clear(); wheelWeightInputs.clear();
        grid.getChildren().removeIf(node -> GridPane.getRowIndex(node) != null && GridPane.getRowIndex(node) >= 13);
    }

    private void handleResetAll() {
        carTypeChoice.setValue(null); brandInput.clear();
        priceInput.clear(); colorInput.clear();
        horsepowerInput.clear(); wheelsInput.clear();
        wheelWeightInputs.clear(); airConditioning.setSelected(false);
        leatherSeats.setSelected(false); sunroof.setSelected(false);
        materialChoice.setValue(null); distinctiveFeatureInput.clear();
        grid.getChildren().remove(luxuryFeatureChoice);
        grid.getChildren().removeIf(node -> GridPane.getRowIndex(node) != null && GridPane.getRowIndex(node) >= 13);
    }

    private void handleSubmit() {
        CarConfigurator configurator = new CarConfigurator(carTypeChoice, brandInput, priceInput, colorInput, horsepowerInput,
                wheelsInput, wheelWeightInputs, airConditioning, leatherSeats, sunroof, materialChoice, distinctiveFeatureInput, luxuryFeatureChoice);
        configurator.handleSubmit();
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}