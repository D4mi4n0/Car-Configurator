package org.CarConfig;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

import java.util.List;

/**
 * Handles the input and validation for the number of wheels and their weights.
 */

public class WheelsHandler {

    private TextField wheelsInput;
    private List<TextField> wheelWeightInputs;
    private GridPane grid;

    /**
     * Constructs a WheelsHandler with the provided inputs.
     *
     * @param wheelsInput the text field for entering the number of wheels
     * @param wheelWeightInputs the list of text fields for entering the weights of the wheels
     * @param grid the grid pane for displaying the wheel weight inputs
     */
    public WheelsHandler(TextField wheelsInput, List<TextField> wheelWeightInputs, GridPane grid) {
        this.wheelsInput = wheelsInput;
        this.wheelWeightInputs = wheelWeightInputs;
        this.grid = grid;
    }

    /**
     * Handles the input for the number of wheels.
     *
     * @param newValue the new value of the wheels input
     */
    public void handleWheelsInput(String newValue) {
        if (!isValidNumber(newValue)) {
            wheelsInput.setText(newValue.replaceAll("[^\\d]", ""));
            return;
        }
        if (newValue.isEmpty()) { return; }
        int numberOfWheels = Integer.parseInt(newValue);
        if (!isValidWheelCount(numberOfWheels)) {
            showError("Number of wheels must be between 1 and 4."); return;
        }
        updateWheelInputs(numberOfWheels);
    }

    private boolean isValidNumber(String value) {
        return value.matches("\\d*");
    }

    private boolean isValidWheelCount(int count) {
        return count >= 1 && count <= 4;
    }

    private void updateWheelInputs(int numberOfWheels) {
        wheelWeightInputs.clear();
        grid.getChildren().removeIf(node -> GridPane.getRowIndex(node) != null && GridPane.getRowIndex(node) >= 13);
        for (int i = 0; i < numberOfWheels; i++) {
            Label wheelWeightLabel = new Label("Enter weight for wheel " + (i + 1) + " (6 - 10):");
            GridPane.setConstraints(wheelWeightLabel, 0, 13 + i);
            TextField wheelWeightInput = new TextField();
            GridPane.setConstraints(wheelWeightInput, 1, 13 + i);
            wheelWeightInputs.add(wheelWeightInput);
            grid.getChildren().addAll(wheelWeightLabel, wheelWeightInput);
        }
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}