package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.components.HelloBox;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        HelloBox helloBox = new HelloBox();
        Scene scene = new Scene(helloBox, 380, 200);

        primaryStage.setScene(scene);

        // A property 'app.system-properties.stage.title = "Hello Conveyor"' is configured in conveyor.conf;
        // After packaging the application with Conveyor, a system property named 'stage.title' is obtained;
        // If MainApp is run directly, the default title "Tip: Launch from IDE" will be used.
        String title = System.getProperty("stage.title", "Tip: Launch from IDE");
        primaryStage.setTitle(title);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}