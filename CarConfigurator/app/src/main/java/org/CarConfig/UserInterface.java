package org.CarConfig;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * The UI connected with the main Application (App.java)
 */
public class UserInterface extends Application {

    private static boolean isLaunched = false;

    public static void main(String[] args) {
        if (!isLaunched) {
            isLaunched = true;
        }
        launch(args);
    }

    /**
     * The start method is called after the application is launched.
     * It loads the FXML file, sets the title, scene, and shows the primary stage.
     *
     * @param primaryStage the primary stage for this application
     * @throws Exception if the FXML file cannot be loaded
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org/CarConfig/UserInterface.fxml")));
        primaryStage.setTitle("Car Configurator");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }
}